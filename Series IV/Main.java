#include<iostream>
using namespace std;
int main()
{
    int a,b=1,n,i;
    cin>>n;
    for(i=1;i<=n;i++)
    {
      if(b%2==0)
        {
            a=(b*b)-2;
          b++;
        }
        else if(b%2==1)
        {
            a=(b*b)-1;
          b++;
        }
        cout<<a<<" ";
        
        
        
    }
}