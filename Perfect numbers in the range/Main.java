#include<iostream>
using namespace std;
int main(){
int start,end;
  cin>>start>>end;
  int sum;
  for(int n=start;n<=end;n++){
    int i=1;
    sum = 0;
    while(i<n){
      if(n%i==0)
           sum=sum+i;
          i++;
    }
    if(sum==n)
      cout<<n<<" ";
  }
      printf("\n");
  
  
}