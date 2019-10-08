; cerner_2^5_2019
; Calculate factorial of first argument
; To run: nasm -fmacho64 factorial.asm && gcc factorial.o && ./a.out <value>
        global   _main
        extern   _atoi
        extern   _printf
        default  rel

        section  .text
_main:
        ; Never used but is necessary to align stack
        push rbx

        ; Get first argument
        mov rdi, [rsi+8]

        ; Convert first argument to an integer (value in rax)
        call _atoi

        ; Move rax into rdi so that factorial can use it
        mov rdi, rax

        ; Call factorial function
        call factorial

        ; First argument to printf
        lea rdi, [format]

        ; Second argument to printf
        movsxd rsi, eax

        ; Call printf(format, factorial)
        call _printf

        ; Undo push to align stack from beginning
        pop rbx
        ret

factorial:
        ; if n > 1 jump to L1
        cmp     rdi, 1
        jnbe    L1

        ; else return 1
        mov     rax, 1
        ret

L1:
        ; Save n on stack
        push    rdi

        ; n = n - 1
        dec     rdi

        ; Call factorial(n-1)
        call    factorial

        ; Restore n
        pop     rdi

        ; Return n * factorial(n-1)
        imul    rax, rdi
        ret

        section  .data
format: db       "%d", 10, 0