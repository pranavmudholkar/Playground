#include<iostream>
using namespace std;
int main()
{
  int num,a,sum=0,n;
  cin>>num;
  n = num;
  while(num>0)
  {
    a=num%10;
    sum=sum+a;
    num=num/10;
  }
  if(n%sum==0)
    cout<<"Harshad Number";
   else
     cout<<"Not Harshad Number";
}