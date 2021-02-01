#include<iostream>
using namespace std;
int print(int b[],int n)
{
    int sum,sum1;
    for(int i=0;i<n;i++)
    {
    if(b[i]%2==0)
    {
        sum=sum+b[i];
    }
    else 
    {
        sum1=sum1+b[i];
    }
    }
    cout<<"The sum of the even numbers in the array is "<<sum<<endl;
    cout<<"The sum of the odd numbers in the array is "<<sum1;
}
int main()
{
 int size;
 cin>>size;
 int a[15];
 for(int i=0;i<size;i++)
 {
     cin>>a[i];
 }
 print(a,size);
}