#include<iostream>
using namespace std;
int main()
{
  int a=6,i,n;
  cin>>n;
  for(i=1;i<=n;i++)
  {
    cout<<a<<" ";
    a=a+5*i;
  }
}