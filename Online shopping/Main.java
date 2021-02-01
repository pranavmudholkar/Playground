#include<iostream>
using namespace std;
int main()
{
 int a,b,c,d,e,f,g,h,i;
  int x,y,z;
  cin>>a>>b>>c;
  cin>>d>>e>>f;
  cin>>g>>h>>i;
  x=(a-(a*b/100))+c;
   y=(d-(d*e/100))+f;
   z=(g-(g*h/100))+i;
  cout<<"In Flipkart Rs."<<x<<"\n";
  cout<<"In Snapdeal Rs."<<y<<"\n";
  cout<<"In Amazon Rs."<<z<<"\n";
  if(x<=y && x<=z)
    cout<<"He will prefer Flipkart";
  else if(y<=z)
    cout<<"He will prefer Snapdeal";
  else
    cout<<"He will prefer Amazon";
}