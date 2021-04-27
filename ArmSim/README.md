
## [Count no of 1's in the given number](ArmSim/Count_1s.s)
![](https://github.com/ashcode028/Computer-Organisation/blob/5444076cc344c27cb0ecf63e18514f23e054804d/ArmSim/Count1s.png)
## [Sum elements of an array and print on the std output handle.](ArmSim/p1.s)
![](https://github.com/ashcode028/Computer-Organisation/blob/5444076cc344c27cb0ecf63e18514f23e054804d/ArmSim/P1.png)
## [Example that invokes a procedure with subroutine](ArmSim/p2.s)
![](https://github.com/ashcode028/Computer-Organisation/blob/5444076cc344c27cb0ecf63e18514f23e054804d/ArmSim/P2.png)
## [Program to add 2-byte integers](ArmSim/P09.s)
![](https://github.com/ashcode028/Computer-Organisation/blob/5444076cc344c27cb0ecf63e18514f23e054804d/ArmSim/P09.png)
## [Program to add 64-bit integers using the program to add 2-byte integers (using stacks)](ArmSim/P10.s)
![](https://github.com/ashcode028/Computer-Organisation/blob/5444076cc344c27cb0ecf63e18514f23e054804d/ArmSim/P10A.png)
## [Program to find no of 1s in a given number(ArmSim and C++)](ArmSim/P14.s)
![](https://github.com/ashcode028/Computer-Organisation/blob/5444076cc344c27cb0ecf63e18514f23e054804d/ArmSim/P14.png)
```
#include<iostream>
using namespace std;
int main(){
int r1;
cin>>r1;
bool seq = false;
int count = 0;
while(r1>0){       //to make sure the input value is greater than 0 as we right shift after every iteration
  int r = r1&1;
  if(r==1){
    if(seq==false){              
       seq = true;
        count++;
    }
   }
  else{
    if(seq==true){
      seq=false;
    }
  }
  r1 = r1>>1;
 }
cout<<endl<<count;
return 0;
}
```
