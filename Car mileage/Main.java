#include<iostream>
using namespace std;
int main()
{
  float milege;
  int petrol,distance;
  cin>>milege;
  cin>>petrol;
  cin>>distance;
  float canTravel=milege*petrol;
  if(canTravel>=distance){
  cout<<"Can reach";
  }
  else
    cout<<"Cannot reach";
}