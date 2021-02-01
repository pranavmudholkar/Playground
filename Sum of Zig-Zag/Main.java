#include<iostream>
using namespace std;
int main()
{
 int r,c,i,j,sum1=0,sum2=0,sum3=0;
  cin>>r>>c;
  int a[r][c];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      cin>>a[i][j];
    }
  }
    for(j=0;j<c;j++)
    {
      sum1=sum1+a[0][j];
    }
  
  for(i=1;i<=r;i++)
  {
    for(j=1;j<=c;j++)
    {
      if(i+j==r-1)
        sum2=sum2+a[i][j];
    }
  }
    for(j=0;j<c;j++)
    {
      sum3=sum3+a[r-1][j];
      
    }
  
  cout<<"Sum of Zig-Zag pattern is "<<(sum1+sum2+sum3);
}