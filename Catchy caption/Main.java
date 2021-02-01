#include <cstring>
#include <iostream>
int main()
{
  int i,l;
  char str[100];
  std::cin.getline(str,100);
  l=strlen(str);
  if(l<50)
    std::cout<<"Caption eligible for the contest";
  else
    std::cout<<"Caption not eligible for the contest";
}