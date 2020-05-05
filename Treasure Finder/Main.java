#include<iostream>
using namespace std;
int main()
{
int x,y,z;
  cin>>x;
  cin>>y;
  cin>>z;
  if((x>y && x<z)||(x>z && x<y)){
  	cout<<"The treasure is in box which has number "<<x<<endl;
    if(y%x==0 && z%x==0){
    cout<<"The code to open the box is "<<x<<endl;
    }
    else if(x%y==0 && z%y==0){
    cout<<"The code to open the box is "<<y<<endl;
    }
    else if(x%z==0 && y%z==0){
    cout<<"The code to open the box is "<<z<<endl;
    }else{
    cout<<"The code to open the box is "<<1<<endl;
    }
  }else if((y>x && y<z)||(y>z && y<x)){
  	cout<<"The treasure is in box which has number "<<y<<endl;
    if(y%x==0 && z%x==0){
    cout<<"The code to open the box is "<<x<<endl;
    }
    else if(x%y==0 && z%y==0){
    cout<<"The code to open the box is "<<y<<endl;
    }
    else if(x%z==0 && y%z==0){
    cout<<"The code to open the box is "<<z<<endl;
    }else{
    cout<<"The code to open the box is "<<1<<endl;
    }
  }else if((z>x && z<y)||(z>y && z<x)){
  cout<<"The treasure is in box which has number "<<z<<endl;
    if(y%x==0 && z%x==0){
    cout<<"The code to open the box is "<<x<<endl;
    }
    else if(x%y==0 && z%y==0){
    cout<<"The code to open the box is "<<y<<endl;
    }
    else if(x%z==0 && y%z==0){
    cout<<"The code to open the box is "<<z<<endl;
    }else{
    cout<<"The code to open the box is "<<1<<endl;
    }
  }		
}