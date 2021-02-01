#include<iostream>
using namespace std;
int main()
{
  int x,y,d,e,f,g,h,n;
  cout<<"Enter first number : "<<"Enter second number : "<<"Menu "<<"\n";
  cin>>x>>y;
cout<<"1.Addition\n" ;
cout<<"2.Subtraction\n";
cout<<"3.Multiplication\n";
cout<<"4.Division\n";
cout<<"5.Remainder\n";
  cin>>n;
switch(n){
    case 1: 
       d=x+y;
      cout<<d;
      break;
    case 2:
       e=x-y;
      cout<<e;
      break;
    case 3:
       f=x*y;
      cout<<f;
      break;
    case 4:
      g=x/y;
      cout<<g;
      break;
    case 5:
      h=x%y;
      cout<<h;
      break;
  default:
    cout<<"Invalid operation";
    break;
    }
}
      