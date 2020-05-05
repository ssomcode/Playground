#include<iostream>
#include<cmath>
using namespace std;
int bacteria(int a, int b){
int result=pow(a,b);
  return result;
}
int main(){
int m,n,req;
  cin>>m>>n>>req;
  int result1=bacteria(m,n);
  if(result1==req|| result1>req){
  cout<<"Doctor, you can proceed with your experiment.";
    
  }else if(result1<req){
  cout<<"Sorry Doctor! You need more bacteria.";
  }
  return 0;
}