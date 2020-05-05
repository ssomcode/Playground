#include<iostream>
#include<cmath>
using namespace std;
int main()
{
int items;
 float inheating;
 cin>>items;
  cin>>inheating;
  float recommended;
  if(items==2){
  recommended=inheating+(inheating/2);
    cout<<recommended<<"0";
  }
  else if(items==3){
  recommended=2*float(inheating);
    cout<<floor(recommended)<<".00";
  }
  else if(items>3){
  cout<<"Number of items is more";
  }
  //cout<<recommended<<".0";
}