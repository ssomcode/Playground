#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  //Type your code here.
  int chalks,days;
  cin>>chalks;
  float remaining=1/sqrt(chalks);
  days=remaining*chalks+1+chalks;
  cout<<days;
  
}