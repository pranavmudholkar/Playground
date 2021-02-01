#include<iostream>
using namespace std;
int main()
{
  int w,x,y,profit;
  std::cin>>w;
  std::cin>>x;
  std::cin>>y;
  profit = w*x - (100 + w*y);
  std::cout<<profit;
}