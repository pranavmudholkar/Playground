#include<iostream>
using namespace std;
int print(int a[],int n)
{
  int odd=0,even=0;
  for(int i=0;i<n;i++)
  {
   if(a[i]%2==0)
   {
     even++;
   }
    else if(a[i]%2==1)
    {
      odd++;
    }
    else 
    {
      return 1;
    }
  }
  if(even==n)
  {
    cout<<"The array is Even";
  }
  else if(odd==n)
  {
    cout<<"The array is Odd";
  }
  else
  {
    cout<<"The array is Mixed";
  }
}
int main()
{
  cout<<"Enter the number of elements in the array"<<"\n";
 int n;
  cin>>n;
  int arr[20];
  cout<<"Enter the elements in the array"<<"\n";
    for(int i=0;i<n;i++)
    {
      cin>>arr[i];
    }
 print(arr,n);
}