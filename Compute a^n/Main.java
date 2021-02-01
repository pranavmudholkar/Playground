#include<iostream>
using namespace std;
int func(int a,int n)
{
  if(n==0)
  {
    return 1;
  }
  else if(n==1)
  {
    return a;
  }
  else
  {
    int x=1,i;
    for(i=1;i<=n;i++)
    {
    x*=a;
    }
    return x;
  }
}   
int main()
{
 int a,n;
  cout<<"Enter the value of a"<<"\n";
  cin>>a;
  cout<<"Enter the value of n"<<"\n";
  cin>>n;
  int q=func(a,n);
  cout<<"The value of "<<a<<" power "<<n <<" is "<<q;
}