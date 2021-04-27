/*add elements in an array and print ans on console*/

.data
arr: .word 30,20,40,100,24

ldr r0, =arr    /*base address of array*/
mov r5, #5      /*no of elements in array*/
/*base address of array a in r0 */
mov r6,#0       /* sum=0  */
mov r2, #0      /*index=0  */
loop:
     ldr r3, [r0, r2, lsl #2]
     add r2,r2, #1    /* idx++ */
     add r6, r6, r3   /* sum+=a[index]*/
     cmp r2, r5       /* loop condition*/
     bne loop
mov r1, r6        	/* copy result to r1 for display */
mov r0, #1		/* load 1 into register 0, standard output handle*/
SWI 0x6b		/* print integer stored in r1 to see output in console*/
SWI 0x11		/* stop program execution */
