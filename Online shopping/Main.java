#include<iostream>
using namespace std;
int main()
{
int Famount,Fdis,Fcharges,Samount,Sdis,Scharges,Aamount,Adis,Acharges;
  cin>>Famount>>Fdis>>Fcharges>>Samount>>Sdis>>Scharges>>Aamount>>Adis>>Acharges;
int Flipkart=(Famount-(Famount*Fdis/100)+Fcharges);
  int Snap=(Samount-(Samount*Sdis/100)+Scharges);
  int Amazon=(Aamount-(Aamount*Adis/100)+Acharges);
cout<<"In Flipkart Rs."<<Flipkart<<endl;
  cout<<"In Snapdeal Rs."<<Snap<<endl;
  cout<<"In Amazon Rs."<<Amazon<<endl;
  if ((Flipkart<Amazon) && (Flipkart<=Snap)){
  cout<<"He will prefer Flipkart";
  }
  else if((Snap<Amazon) && (Snap<Flipkart)){
  cout<<"He will prefer Snapdeal";
  }
  else if((Amazon<Flipkart) && (Amazon<Snap)){
  cout<<"He will prefer Amazon";
  }
  else{
  cout<<"Prefer anything";


  }
  
}