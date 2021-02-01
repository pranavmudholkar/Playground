#include<iostream>
#include<string>
int main() 
{ 
  int i;
std::string name;
  std::getline(std::cin,name);
  for (std::string::reverse_iterator
      i=name.rbegin();i<name.rend();i++)
  {
    std::cout<<*i;
  }
}