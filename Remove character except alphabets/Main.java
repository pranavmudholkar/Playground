#include<iostream>
int main()
{
  int i;
  std::string name;
  std::string name1;
  std::getline(std::cin,name);
    for(i=0;name[i]!='\0';i++)
    {
      if((name[i]>='A'&& name[i]<='Z') || (name[i]>='a' && name[i]<='z'))
      {
        name1+=name[i];
      }
    }
  std::cout<<name1;
}