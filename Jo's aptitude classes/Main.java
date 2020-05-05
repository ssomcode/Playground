#include<iostream>
using namespace std;
int GCD(int a,int b,int c){
  int gcd=0;
  int small=0;
  
if(a<=b && a<=c)
  small=a;
else if(b<=a && b<=c)
  small=b;
else
  small=c;
  
while(small>=1){
if(a%small == 0 && b%small == 0 && c%small ==0){
gcd=small;
  break;
}
  small--;
}
return gcd;
}
int main(){
int n1,n2,n3,hcf;
  cin>>n1>>n2>>n3>>hcf;
  int gcd1=GCD(n1,n2,n3);
  if(gcd1==hcf)
    cout<<"Answer is correct.";
  else
    cout<<"Answer is wrong.";
  return 0;
}