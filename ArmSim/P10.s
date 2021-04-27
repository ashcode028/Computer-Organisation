/*
procedure P09 adds two 64 bit integers
P10 uses P09 to add 96 bit integers
 main function-initialises 96 bit integers and calls P10
*/

P09:
	
	adds r9, r5, r7 /*add lower halves,set carry */
	adcs r8, r4, r6  /* add upper halves and carry */
	bx lr		/*return to callee*/

P10:
	STMDB sp!,{r2-r7}	/*push other registors values to stack*/
	mov r5, r4			/*pushing values to desired registers*/
	mov r4, r3			/*according to P09*/

	STMDB sp!,{lr}		/*pushes lr-to get link to main function*/		
	bl P09				/*branching (with link) to P09*/
	mov r10, r9			/*moving result to desired registers*/
	mov r9, r8			
	mov r8, #0			
	LDMIA sp!,{lr}		/*popping from stack to get link to callee-main()*/

	LDMIA sp!,{r2-r7}	/*pops previous values of registers*/
	adc r8, r2, r5		/*adds last bytes with carry set by P09*/
	bx lr				/*return to calle - main()*/

main:
	mov r2, #12			 /*higher byte A */
	mov r3, #22
	mov r4, #31			 /* lower byte A*/

	mov r5, #41			 /* higher byte B */
	mov r6, #53
	mov r7, #92			 /* lower byte B*/


	mov lr, pc			/*storing return address*/
	b P10				/*calling P10*/
	SWI 0x11			/*exit*/
