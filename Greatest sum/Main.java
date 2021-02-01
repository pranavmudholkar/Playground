#include<iostream>
using namespace std;
int main()
{
 int i,j,r,c,a[10][10],k=1,p=1,s=0,d=0,m=0,m1=0,temp,temp1;
  cin>>r>>c;
 
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      cin>>a[i][j];
    }
  }
  cout<<"Sum of rows is ";
  for(i=0;i<r;i++)
    
  {
    for(j=0;j<c;j++)
    {
      s+=a[i][j];
      temp=s;
     
      
           
    }
    
    cout<<temp<<" ";
     if(m<s)
      {
        m=s;
        p=i;
      }
      
   s=0;   
  }
  
  cout<<"\n"<<"Row "<<p+1<<" has maximum sum"<<"\n";
  cout<<"Sum of columns is ";
for(i=0;i<c;i++)
{
  for(j=0;j<r;j++)
  {
    d+=a[j][i];
     temp1=d;
    
    }
  if(m1<d)
  {
    m1=d;
    k=i;
  }
  
  
  cout<<temp1<<" ";
  d=0;
}
  cout<<"\n"<<"Column "<<k+1<<" has maximum sum";
}