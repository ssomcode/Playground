#include<iostream>
using namespace std;
int main(){
  int encr,terr;
  cin>>encr>>terr;
  int per=0;
  int sum=encr+terr;
  for(int i=1;i<sum;i++){
  if(sum%i == 0){
  per=per+i;
  }
    
  }
  if(per==sum)
  {
  cout<<"They can read the message";
  }else{
  cout<<"They can't read the message";
  }
}