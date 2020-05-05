#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n;
  cin>>n;
  int marks[n];
  for(int i=0;i<n;i++){
  cin>>marks[i];
  }
  int max=0;
  for(int i=0;i<n;i++){
  if(marks[i]>max)
    max=marks[i];
  }
  cout<<max;
  return 0;
}