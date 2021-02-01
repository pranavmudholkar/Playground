#include<iostream>
using namespace std;
int main()
{
  int x,y;
  cin>>x;
 if(x<=200)
 {
    y=x*0.5;
    cout<<"Rs."<<y;
 }
  else if(x<=400)
  {
     y=((x*0.65)+100);
     cout<<"Rs."<<y;
  }
  else if(x>=600)
  {
     y=((x*1.25)+425);
       cout<<"Rs."<<y;
  }
}