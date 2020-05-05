#include<iostream>
using namespace std;
int main(){
int maxwe,weight;
  cin>>maxwe>>weight;
  if(maxwe>weight)
    cout<<"Yes, you can enter.";
  else if(maxwe==weight)
    cout<<"Yes, you can enter. Kindly use a rope.";
  else
    cout<<"Sorry, you can't enter";
}