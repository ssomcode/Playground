#include<iostream>
using namespace std;
int main()
{
  int count;
  cin>>count;
  int n1=0;
  int n2=1;
  int n3;
  for(int i=2;i<count;i++){
  n3=n1+n2;
    n1=n2;
    n2=n3;
  }
  cout<<n3;
}