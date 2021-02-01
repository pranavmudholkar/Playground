#include<iostream>
using namespace std;
struct employee
{
  char name[30];
  int id;
  int age;
  char designation[30];
    int salary;
};
int main()
{
  employee e[100];
  cin>>e[0].name>>e[0].id>>e[0].age>>e[0].designation>>e[0].salary;
  cout<<"Enter name:"<<"\n";
cout<<"Enter ID:"<<"\n";
cout<<"Enter age:"<<"\n";
cout<<"Enter designation:"<<"\n";
cout<<"Enter Salary:"<<"\n";
cout<<"Employee Details"<<"\n";
    cout<<"Name of the Employee : "<<e[0].name<<"\n";
  cout<<"ID of the Employee : "<<e[0].id<<"\n";
  cout<<"Age of the Employee : "<<e[0].age<<"\n";
  cout<<"Designation of the Employee : "<<e[0].designation<<"\n";
  cout<<"Salary of the Employee : "<<e[0].salary<<"\n";
return 0;
}