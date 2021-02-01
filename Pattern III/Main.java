#include<iostream>
using namespace std;
int main()
{
  int r,c,n,k,s;
  cin>>n;
  for(r=1;r<=n;r++)
  {
    for(c=1;c<=r;c++)
    {
      if(c!=r)
        cout<<r<<"*";
      else
        cout<<r;
    }
    cout<<"\n";
  }
  
  for(r=n;r>=1;r--)
  {
    for(c=1;c<=r;c++)
    {
      if(c!=r)
        cout<<r<<"*";
      else
        cout<<r;
    }
    cout<<"\n";
  }
}