#include<iostream>
using namespace std;
int main()
{
 int a,b[100],c,i,flag=0;
  cin>>a;
  for(i=0;i<a;i++)
  {
    cin>>b[i];
  }
  cin>>c;
  for(i=0;i<a;i++)
  {
    if(b[i]==c)
    {
      flag=1;
      break;
    }
  }
  if(flag==1)
    cout<<"She passed her exam";
  else 
    cout<<"She failed";
  return 0;
}