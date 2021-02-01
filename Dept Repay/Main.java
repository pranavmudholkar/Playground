#include<iostream>
using namespace std;
int main()
{
 int p,r,t;
  float i,r1,a,d,f;
  std::cin>>p;
  std::cin>>t;
  std::cin>>r;
  i=(p*r*t)/100;
  a=p+i;
  d=(i*2)/100;
  f=a-d;
  std::cout<<i<<"\n";
  std::cout<<a<<"\n";
  std::cout<<d<<"\n";
  std::cout<<f<<"\n";
}