#include<iostream>
using namespace std;
int print(int a[],int n)
{
  int sum=0,i;
  for(i=0;i<n;i++)
  {
    sum=sum+a[i];
  }
  return sum;
}
    
int main()
{
  int n,c;
  int i;
  cin>>n>>c;
   int arr[n];
  for(i=0;i<n;i++)
  {
    cin>>arr[i];
  }
  int z=print(arr,n);
   if(z<=c)
   {
     cout<<"YES";
   }
  else if(z>c)
  {
    cout<<"NO";
  }
  
}