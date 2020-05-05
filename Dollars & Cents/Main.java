#include<iostream>
using namespace std;
int main()
{
int dollar1,cent1,dollar2,cent2;
  cin>>dollar1>>cent1>>dollar2>>cent2;
  int dollsum=dollar1+dollar2;
  int centsum=cent1+cent2;
  int carry;
  if(centsum>=100){
  carry=centsum/100;
    dollsum=dollar1+dollar2+carry;
  centsum=cent1+cent2-100;
  
  }else{
  carry=0;
  }
  cout<<dollsum<<endl;
  cout<<centsum;
  return 0;
  

}