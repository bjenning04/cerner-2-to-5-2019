%% cerner_2^5_2019
%% Determines if the input is a prime number to a high degree of probability using Fermat's little theorem.
-module(primes).

-export([make/1, is_prime/1]).
-compile(export_all).

%% make a prime with at least K decimal digits
%% Here we use 'Bertrand's postulate, is that for every N > 3,
%% there is a prime P satisfying N < P < 2N - 2

%% make(N) -> a random integer with N digits.
make(N) -> new_seed(), make(N, 0).
make(0, D) -> D;
make(N, D) -> make(N-1, D*10 + (random:uniform(10)-1)).

%% Fermat's little theorem says that if 
%% N is a prime and if A < N then
%% A^N mod N = A
is_prime(D) ->
    new_seed(),
    is_prime(D, 100).

is_prime(D, Ntests) ->
    N = length(integer_to_list(D)) -1,
    is_prime(Ntests, D, N).

is_prime(0, _, _) -> true;
is_prime(Ntest, N, Len) ->
    K = random:uniform(Len),
    %% A is a random number less than N 
    A = make(K),
    if 
	A < N ->
        case trunc(math:pow(A,N)) rem N of
		A -> is_prime(Ntest-1,N,Len);
		_ -> false
	    end;
	true ->
	    is_prime(Ntest, N, Len)
    end.

new_seed() ->
    {_,_,X} = erlang:now(),
    {H,M,S} = time(),
    put(random_seed, {H*X rem 32767, M*X rem 32767, S*X rem 32767}).