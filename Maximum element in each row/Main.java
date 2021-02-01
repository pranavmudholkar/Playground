#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j,max=0,a[10][10];
  cin>>r>>c;
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      cin>>a[i][j];
    }
  }
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      if(max<=a[i][j])
      {
        max=a[i][j];
      }
      
    }
  cout<<max<<"\n";
    max=0;
      
}
    }