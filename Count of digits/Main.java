#include<iostream>
using namespace std;
int main()
{
  int i,n,count=0;
  cin>>n;
  do
  {
    i=n%10;
    count++;
    n=n/10;
  }while(n>0);
    cout<<count;
}