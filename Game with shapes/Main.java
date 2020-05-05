#include<iostream>
using namespace std;
int main()
{
int length,radius;
  cin>>radius;
  cin>>length;
  int dia=radius*2;
  if(dia<=length){
  cout<<"circle can be inside a square";
  }
  else
    cout<<"circle cannot be inside a square";
  
}