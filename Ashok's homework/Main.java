#include<iostream>
using namespace std;
int main()
{
    // Type your code here
  int r,c;
  cin>>r>>c;
  int mat1[r][c];
  int mat2[r][c];
  int fin[r][c];
  for(int i=0;i<r;i++){
  for(int j=0;j<c;j++){
  cin>>mat1[i][j];
  }
  }
  for(int i=0;i<r;i++){
  for(int j=0;j<c;j++){
  cin>>mat2[i][j];
  }
  }
  
  for(int i=0;i<r;i++){
  for(int j=0;j<c;j++){
  fin[i][j]=mat1[i][j]+mat2[i][j];
    cout<<fin[i][j]<<" ";
  }
    cout<<endl;
  }
  return 0;
}