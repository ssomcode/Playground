#include<iostream>
using namespace std;
int main()
{
  int w,x,y,profit;
  int fixed=100;
  cin>>w;
  cin>>x;
  cin>>y;
  
  profit=(w*x)-(w*y)-fixed;
  cout<<profit;
  return 0;
  
}