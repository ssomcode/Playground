#include<iostream>
#include<cmath>;
using namespace std;
int main()
{
  int locx=3;
  int locy=4;
  int x,y;
  cin>>x;
  cin>>y;
  float dist=sqrt(((x-locx)*(x-locx))+((y-locy)*(y-locy)));
  int hops=floor(dist);
  cout<<hops;
  return 0;
}