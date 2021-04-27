      mov     r2, #1      /* idx = 1 */
      mov     r4, #0	/* count = 0 */
	mov r1,#0x45 
loop: 
      and     r3, r1, #1        ;/* extracts the LSB and compare */
      cmp     r3, #1
      addeq   r4, r4, #1        ;/* increment the counter */
      mov     r1, r1, lsr #1    ;/* prepares for the next iteration */
      add     r2, r2, #1
      cmp     r2, #32           ;
      ble     loop              ; /*branch to loop if less than or eq*/
mov r1, r4

SWI 0x6b
SWI 0x11        /*print mechanism*/