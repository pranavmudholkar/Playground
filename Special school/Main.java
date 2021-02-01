#include<iostream>
#include<string>
int main() 
{ 
  int i;
std::string name;
  std::string name1;
   std::string k;
  std::getline(std::cin,name);
   std::getline(std::cin,name1);
  for (std::string::reverse_iterator
      i=name.rbegin();i<name.rend();i++)
  {
    k+=*i;
  }
  if(k==name1)
  {
    std::cout<<"It is correct";
  }
  else if(k!=name1)
  {
    std::cout<<"It is wrong";
  }
}