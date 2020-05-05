#include<iostream>
using namespace std;
int main()
{
int maxw,adults,children;
 cin>>maxw;
 cin>>adults;
 cin>>children;
 int adw=adults*75;
 int cw=children*30;
 int total=adw+cw;
  if(total<=maxw)
    cout<<"Boat is stable";
   else 
     cout<<"Boat will drow";
  
}