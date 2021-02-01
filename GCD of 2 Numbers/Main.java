#include<iostream>
using namespace std;
int gcd(int a,int b)
{
  if(a==0)
    return b;
  if(b==0)
    return a;
  else 
    return gcd(b,a%b);
}
int main()
{
  int a,b;
  cin>>a>>b;
  int r=gcd(a,b);
  cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<r;
}