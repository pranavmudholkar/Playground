#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
  int *a;
  int n;
  cin>>n;
  int m,l,i;
  a= (int*)malloc(n*sizeof(int));
  for(i=0;i<n;i++)
  {
    cin>>*(a+i);
  }
  for(i=0;i<n;i++)
  {
  if(*(a+i)%2==0)
  {
    m++;
  }
  else if(*(a+i)%2==1)
    {
      l++;
    }
  }
  cout<<l<<"\n"<<m;
  return 0;
}