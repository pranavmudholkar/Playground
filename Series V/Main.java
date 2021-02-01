#include<iostream>
using namespace std;
int main()
{
  int a=11,i,n;
  cin>>n;
  for(i=1;i<=n;i++)
  {
    cout<<a*a<<" ";
    a=(a+4);
  }
}