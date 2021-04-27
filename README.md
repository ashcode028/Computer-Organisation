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
  1. Count no of 1's in the given number
  2. Sum elements of an array and print on the std output handle.
  3. Example that invokes a procedure named P with three integer parameters. 
     The procedure adds the first two and multiplies it with the third. 
     Procedure P is invoked with arguments 11, 22 and 33. 
  The result returned by P is printed on the std output handle.
  4. Program to add 2-byte integers
  5. Program to add 64-bit integers using the program to add 2-byte integers (C++)
  6. Program to find no of 1s in a given number(ArmSim and C++)

### [Visual Programs](Visual/README.md):
  1. Sum elements of an array and print on the std output handle.
  2. This program defines a procedure P, which takes three arguments using registers(r0-r2).
     It add the first two, and multiplies the result by the third argument.This program uses this procedure, and prints the      result on std output handle
### MicroProgramming Examples:
  1. Program to check if the value in r2 is a perfect square or not.
  2. Program to check if the value in r2 is a palindrome or not.
### [Cache Implementation](Cache/README.md):
  A cache of size S with CL as the number of cache lines and block size B is to be built. S, CL, and B are in powers of 2.     Program that allows loading into cache and searching cache using
  1. Direct mapping 
  2. Associative memory
  3. n-way set associative memory where n is a power of 2.

### Code for ALU in VHDL
  1. Basic operation ADD is implemented with overflow flags.
