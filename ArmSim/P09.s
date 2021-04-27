


PO9:	
	adds r9,r5,r7  /*add lower halves,set carry */
	adc  r8,r4,r6  /* add upper halves and carry */
	bx lr
	
 main:
	mov r4,#576 /*higher byte A */
	mov r5,#63 /* lower byte A*/
	mov r6,#43 /* higher byte B */
	mov r7,#2 /* lower byte B*/
	mov lr,pc
	bl PO9

	

	

