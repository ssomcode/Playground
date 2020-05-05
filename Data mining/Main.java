#include<iostream>
using namespace std;
int main()
{
int n;
  cin>>n;
  int digits;
  int even=0;
  int odd=0;
  while(n!=0){
  digits=n%10;
    
    if(digits%2==0){
    even=even+digits;
    }else{
    odd=odd+digits;
    }
    n=n/10;
  }
  if(even==odd)
    cout<<"Yes";
  else
    cout<<"No";
}