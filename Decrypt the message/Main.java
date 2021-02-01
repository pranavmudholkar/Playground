#include<iostream>
using namespace std;
int main()
{
  int a,b,sum=0,num,i,div;
  cin>>a>>b;
  num=a+b;
  for(i=1;i<num;i++)
  {
    div=num%i;
    if(div==0)
    {
      sum=sum+i;
    }
  }
  
  if(num==sum)
    cout<<"They can read the message";
  else
    cout<<"They can't read the message";
  }