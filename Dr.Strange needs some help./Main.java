#include<iostream>
#include<cmath>
using namespace std;
int abc(int,int);
int abc(int q,int r)
{
  int l;
  l=pow(q,r);
  return l;
}
int main()
{
    int m,n,req;
    cin>>m>>n>>req;
    int z=abc(m,n);
  if(z>=req)
  cout<<"Doctor, you can proceed with your experiment.";
  else
  cout<<"Sorry Doctor! You need more bacteria.";
}