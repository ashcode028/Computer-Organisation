P14:
	mov r2, #0		/*stores value of last encounter*/
	mov r3, #0		/*stores count*/
.loop:
	and r4, r1, #1	/*extracts last bit*/
	cmp r4, #0
	beq .second

	cmp r2,#1
	beq .last
	mov r2, #1
	add r3, r3, #1 
	b .last
.second:
	cmp r2, #0
	beq .last
	mov r2, #0
.last:
	mov r1, r1, lsr #1
	cmp r1, #0
	bgt .loop
	bx lr


main:
	mov r1, #-77
	mov lr, pc
	b P14
	SWI 0x11