#include<iostream>
#include<cmath>
using namespace std;
int gcd(int,int,int);
int gcd(int a,int b,int c)
{
  int small=0,m=0;
  if(a<b && a<c)
  {
    small=a;
  }
  else if(b<a && b<c)
    small=b;
  else
    small=c;
  while(small>=1)
  {
    if(a%small==0 && b%small==0 && c%small==0)
    {
      m=small;
      break;
    }
    small--;
  }
  return m;
}
int main()
{
  int r,s,t,w;
  cin>>r>>s>>t>>w;
 int z= gcd(r,s,t);
  if(z==w)
  {
    cout<<"Answer is correct.";
  }
  else
  {
    cout<<"Answer is wrong.";
  }
}