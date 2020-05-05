#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n;
  cin>>n;
  int temp=0;
  do{
  n=n/10;
    temp++;
  }while(n!=0);
  cout<<temp;
  return 0;
}