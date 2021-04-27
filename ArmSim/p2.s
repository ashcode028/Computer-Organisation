/* program to add first two integers and multiply the result with the integer*/








P:
	STMDB sp!,{r4-r11} /* push other registers to stack */
	add r0,r1 	   /* add value in r1 to r0*/
	mul r0, r2	/* multiply value in r2 to r0 */
	LDMIA sp!,{r4-r11}  /*pop the old values of regs */
	mov pc,lr		/* return the control to the caller */
main:
	mov r0, #15		/* give argument 1*/
	mov r1, #24		/* give argument 2*/
	mov r2, #37		/* give argument 3*/
	bl P			/* cal procedure P*/
	mov r1, r0		/* stored result in r1 for std display */
	mov r0, #1		/* std output handle */
	SWI 0x6b		/* displays result in r1 to std out */
	SWI 0x11		/* stop execution */
