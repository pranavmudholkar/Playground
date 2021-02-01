#include<iostream>
#include<string>
using namespace std;
int main()
{
int i,a=0,b=0,c=0,d=0,e=0;
  std::string str;
  std::getline(std::cin,str);
  for(i=0;str[i]!='\0';i++)
  {
    if(str[i]=='a'||str[i]=='A'||str[i]=='e'||str[i]=='E'||str[i]=='i'||str[i]=='I'||str[i]=='o'||str[i]=='O'||str[i]=='u'||str[i]=='U')
        a++;
    else if((str[i]>'a'&&str[i]<='z')||(str[i]>'A'&&str[i]<='Z'))
        b++;
    else if(str[i]==' ')
        c++;
    else if(str[i]>='0'&&str[i]<='9')
        d++;
     else
        e++;
  }
  std::cout<<"Vowels:"<<a<<"\n";
  std::cout<<"Consonants:"<<b<<"\n";  
  std::cout<<"White Spaces:"<<c<<"\n";
  std::cout<<"Digits:"<<d<<"\n";
  std::cout<<"Symbols:"<<e;
}