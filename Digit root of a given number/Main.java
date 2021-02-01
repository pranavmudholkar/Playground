#include<iostream>
using namespace std;
int func(int n)
{
    if(n<=9)
    {
        return n;
    }
    else
    {
      int sum=0,a;
        while(n!=0)
        {
        a=n%10;
        sum=sum+a;
        n=n/10;
        }
        return func(sum);
        return sum;
    }
}
int main()
{
    int n;
    cin>>n;
    cout<<func(n);
    
}