#include<iostream>
using namespace std;
int main()
{
  std::string str;
  std:getline(std::cin,str);
  std::cout<<"The number of letters in the name is "<<str.length();
}