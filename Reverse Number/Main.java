#include <iostream>
using namespace std;
int main() 
{
	// Type your code here
	int n;
  int reverse=0;
  cin>>n;
  while(n>0){
  reverse=reverse*10 + n%10;
    n=n/10;
  }
  cout<<reverse;
  return 0;
}