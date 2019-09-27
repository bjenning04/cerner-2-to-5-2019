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
        %% Would be better to use powrem() as listed below, but couldn't fit into 32 lines of code
        % case powrem(A, N, N) of
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

%% A better way to calculate A^N % N
% powrem(A, 1, M) ->
%     A rem M;
% powrem(A, 2, M) ->
%     A*A rem M;
% powrem(A, B, M) ->
%     B1 = B div 2,
%     B2 = B - B1,
%     %% B2 = B1 or B1+1
%     P = powrem(A, B1, M),
%     case B2 of
%     B1 -> (P*P) rem M;
%     -> (P*P*A) rem M
%     end.