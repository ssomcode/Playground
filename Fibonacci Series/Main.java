#include<iostream>
using namespace std;
int fib(int x) {
   if((x==1)||(x==0)) {
      return(x);
   }else {
      return(fib(x-1)+fib(x-2));
   }
}

int main()
{
  //Type your code here.
  int x;
   cin >> x;
      cout<<"The term "<<x<<" in the fibonacci series is "<<fib(x-1);
   
   return 0;
}