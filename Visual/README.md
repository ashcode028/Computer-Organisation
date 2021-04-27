
### Program to add elements of the array and prints its output to std output.
```
data
var1		DCD		30 ,20 ,40 ,100 ,24
		
		LDR		r0, =var1
		mov		r5, #5
		mov		r6,#0
		mov		r2, #0
loop
		ldr		r3, [r0, r2, lsl #2]
		add		r2,r2, #1
		add		r6, r6, r3
		cmp		r2, r5
		bne		loop
		mov		r1, r6
		mov		r0, #1
 ```
 ![Output]()
### Example of a Procedure having a subroutine.
Example that invokes a procedure named P with three integer parameters. The procedure adds the first two and multiplies it with the third. Procedure P is invoked with arguments 11, 22 and 33. The result returned by P is printed on the std output handle.
```
main
		mov		r0, #15
		mov		r1, #24
		mov		r2, #37
		mov		lr, pc
		b		prog
		END
prog		STMDB	sp!,{r4-r11}
		add		r0, r0, r1
		;code to multiply
		mov		r3, #0
		mov		r4, #0
mul		add		r3, r3, #1
		add		r4, r4, r0
		cmp		r2, r3
		bne		mul
		mov		r0, r4
		LDMIA	sp!,{r4-r11}
		mov		pc, lr
```
