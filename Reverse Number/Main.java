#include <iostream>
using namespace std;
int main() 
{
	int i,n;
  cin>>n;
  while(n>0)
  {
    i=n%10;
    cout<<i;
    n=n/10;
  }
   return 0;
}