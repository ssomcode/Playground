#include<iostream>
using namespace std;
int main()
{
int rows,cols,poss;
  cin>>rows>>cols>>poss;
 if((poss<=cols)||((poss-1)%cols == 0)||((poss-cols)%cols == 0)){
 cout<<"Yes";
 } else{
 cout<<"No";
 }
}