#include<iostream>
using namespace std;
int main()
{
  int n,count=0,i;
  cin>>n;
  for(i=1;i<=n;i++)
  {
  if(n%i==0)
    count++;
  }
    if(count==2)
  cout<<"Eligible";
    else
      cout<<"Not eligible";
  }