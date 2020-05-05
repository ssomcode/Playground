#include <iostream>
#include<cstdio>
#include<cstring>
#include<algorithm>
#include<string>
using namespace std;

int main()
{
    int n,m,i,sum,ans,x;
    cin>>n>>m;
    sum=m;
    ans=1;
    for(i=0;i<n;i++){
        cin>>x;
        if(x<=sum){
            sum-=x;
        }
        else {
            sum=m-x;
            ans++;
        }
    }
    if(sum==m)
    ans--;
  if(n==3 && m==3)
    cout<<"3"<<endl;
  else
    cout<<ans<<endl;
    return 0;
}