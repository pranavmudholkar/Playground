#include<iostream>
using namespace std;
int swap(int *q,int *p)
{
  int temp=0;
  temp=*q;
  *q=*p;
  *p=temp;
}
int main()
{
  int x,y;
  cin>>x>>y;
  cout<<"Before swapping a= "<<x<<" "<<"and"<<" "<<"b="<<y<<"\n";
  swap(x,y);
  cout<<"After swapping a= "<<x<<" "<<"and"<<" "<<"b="<<y;
  return 0;
}