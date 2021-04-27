# Computer-Organisation
This repository has all codes  and its explainations with "TRY IT YOURSELF SECTION".
For all those who love assembly coding for different architechtures or for those trying to explore it.
This will be updated fully by August 2021.
Hope you all learn with me.
Any changes/updates are welcomed.

### Requirements-
* linux/Windows os
* gcc compiler
* ARM-SIM
* Visual
- Rest can be installed as we require..You are ready to go.

### Conversions Basics-
  1. Binary to decimal-Multiply each digit from right with powers of 2 starting from 2 till 2 since it is a 16 bit no.then    adding each term.
  2. Hexadecimal To Decimal-Multiply each digit from right with powers of 16 starting from 16 then adding each term.
  3. Hexadecimal To Octal-First convert to binary then group of 3 digits from right (binary to octal)
 
 
### [Arm-Sim Programs](ArmSim/README.md):
  1. Count no of 1's in the given number.[code](https://github.com/ashcode028/Computer-Organisation/tree/main/ArmSim#count-no-of-1s-in-the-given-number)
  2. Sum elements of an array and print on the std output handle.[code](https://github.com/ashcode028/Computer-Organisation/tree/main/ArmSim#sum-elements-of-an-array-and-print-on-the-std-output-handle)
  3. Example that invokes a procedure named P with three integer parameters.
     The procedure adds the first two and multiplies it with the third.
     Procedure P is invoked with arguments 11, 22 and 33. 
  The result returned by P is printed on the std output handle.[code](https://github.com/ashcode028/Computer-Organisation/tree/main/ArmSim#example-that-invokes-a-procedure-with-subroutine)
  4. Program to add 2-byte integers[code](https://github.com/ashcode028/Computer-Organisation/tree/main/ArmSim#program-to-add-2-byte-integers)
  5. Program to add 64-bit integers using the program to add 2-byte integers (using stacks)[code](https://github.com/ashcode028/Computer-Organisation/tree/main/ArmSim#program-to-add-64-bit-integers-using-the-program-to-add-2-byte-integers-using-stacks)
  6. Program to find no of 1s in a given number(ArmSim and C++)[code](https://github.com/ashcode028/Computer-Organisation/tree/main/ArmSim#program-to-find-no-of-1s-in-a-given-numberarmsim-and-c)

### [Visual Programs](Visual/README.md):
  1. Sum elements of an array and print on the std [output](https://github.com/ashcode028/Computer-Organisation/tree/main/Visual#program-to-add-elements-of-the-array-and-prints-its-output-to-std-output) handle.
  2. This program defines a procedure P, which takes three arguments using registers(r0-r2).
     It add the first two, and multiplies the result by the third argument.This program uses this procedure, and prints the      result on std [output](https://github.com/ashcode028/Computer-Organisation/tree/main/Visual#example-of-a-procedure-having-a-subroutine) handle
### Micro-Assembly Programming Examples:
  1. Program to check if the value in r2 is a perfect square or not.
 ```
mmov regSrc,2,<read>
mmov A, regVal
mmov sr1, regVal
mmovi B,1
.loop
mmov A, B
mmov B, B <multiply>
mbeq aluresult, sr1 .true
mbgt aluresult ,sr1 .false
madd B,B#1
mb .loop
.true
mmovi regSrc, 0
mmov regData, 1, <write>
mb .begin
.false
mmovi regSrc,0
mmov regData, 0, <write>
mb .begin
.begin
mload IR
mdecode
madd pc,4
mswitch
 ```
  2. Program to check if the value in r2 is a palindrome or not.
  ```
.begin
mLoadIR
mdecode
madd pc, 4
mswitch
mmovi regSrc, 0
mmovi regData, 1, <write>
mmovi regSrc, 2, <read>
mmov A, regVal
mmovi B, 1, <lsr>
mmov sr1, aluResult
.loop:
mmovi regSrc, 2, <read>
mmov A, regVal
mmovi B, 1, <and>
mmov sr2, aluResult
mmov B, 1, <lsr>
mmovi regSrc, 2
mmov regData, aluResult, <write>
// stack push
mmovi regSrc, 14, <read>
madd regVal, -4
mmov mar, regVal
mmov mdr, sr2, <store>
mmov regData, regVal, <write>
mmov mdr, pc, <store>madd sr1, -1
mmov A, sr1
mmovi B, 0, <cmp>
mbgt .loop
mmovi regSrc, 3, <read>
mmov A, regVal
mmovi B, 1, <and>
mmov A, aluResult
mmov B, 0, <cmp>
mbeq .next
mmovi regSrc, 2, <read>
mmov A, regVal
mmovi B, 1, <lsr>
mmov regData, aluResult, <write>
.next:
mmovi regSrc, 2, <read>
mmov A, regVal
mmovi B, 1, <lsr>
//Divide by 2
mmov sr1, aluResult
.pop:
mmovi regSrc, 14, <read>
mmov mar, regVal, <load>
madd regVal, +4
mmov regData, regVal, <write>
mmov sr2, ldResult
mmovi regSrc, 2, <read>
mmov A, regVal
mmovi B, 1, <and>
mmov A, aluResult
mmov B, sr2, <cmp>
mbne .false
madd sr1, -1mmov A, sr1
mmovi B, 0, <cmp>
mbeq .begin
//exit loop
.false:
mmovi regSrc, 0
mmovi regData, 0, <write>
mb .begin
  ```
### [Cache Implementation](Cache/README.md):
  A cache of size S with CL as the number of cache lines and block size B is to be built. S, CL, and B are in powers of 2.     Program that allows loading into cache and searching cache using
  1. Direct mapping [code](Cache/direct.java) 
  2. Associative memory. [code](Cache/associative.java) 
  3. n-way set associative memory where n is a power of 2.[code](Cache/setAssociative.java) 

### Code for ALU in VHDL
  1. Basic operation ADD is implemented with overflow flags.
