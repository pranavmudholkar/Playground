#include<iostream>
using namespace std;
int fact( int n)
{
  if(n==1)
    return 1;
  else
    return n*fact(n-1);
}
int main()
{
 int n;
  cin>>n;
  int s = fact(n);
 cout<<"The factorial of "<<n<<" is "<<s;
  return 0;
}