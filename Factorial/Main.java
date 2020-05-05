#include<iostream>
using namespace std;
int recur(int a){
if(a==0)
  return 1;
 else 
   return a*recur(a-1);
}
int main()
{
  int n;
  cin>>n;
  cout<<"The factorial of "<<n<<" is "<<recur(n);
  return 0;
}