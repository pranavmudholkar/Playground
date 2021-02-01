#include<iostream>
using namespace std;
int fun(int a,int b)
{
  int x,y;
  if((a+b)%2==0)
  {
    return 1;
  }
  else
    return 0;
  
}
  
int main()
{
 int m,n;
  cin>>n>>m;
  int l=fun(m,n);
  if(l==1)
    cout<<"Mani Iyer";
  else if(l==0)
    cout<<"Arun Gupta";
}