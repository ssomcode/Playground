#include<iostream>
using namespace std;
int main()
{
int byear,cyear;
  cin>>byear;
  cin>>cyear;
  int age;
  if(byear>cyear){
  age=(100-byear+cyear);
  }
  else if(byear<cyear){
  age=(cyear-byear);
  }
  else
    age=100;
  
  cout<<age;
}