#include<iostream>
using namespace std;
int main()
 {
   int a;
   float b,c=10.15,d=13.30,e=18.00,f=22.00;
  cin>>a>>b;
   if(a>13)
   {
     if(b==d || b==e)
     {
       cout<<"$5.00";
     }
     else{
       cout<<"$8.00";
     }
   }
     else if(a<13)
     {
       if(b==d || b==e)
       {
         cout<<"$2.00";
       }
       else
       {
         cout<<"$4.00";
       }
     }
 }