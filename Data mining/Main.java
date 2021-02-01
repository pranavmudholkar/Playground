#include<iostream>
using namespace std;
int main()
{
  int n,i,l,sum1=0,sum2=0;
  cin>>n;
  while(n>0)
  {
    l=n%10;
    if(l%2==0)
      sum1=sum1+l;
    else if(l%2==1)
      sum2=sum2+l;
    n=n/10;
  }
  if(sum1==sum2)
    cout<<"Yes";
  else
    cout<<"No";
}