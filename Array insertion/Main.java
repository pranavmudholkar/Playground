#include <iostream>
using namespace std;
 
int main()
{
   int array[100], position, c, n, value;
   cout<<"Enter the number of elements in the array"<<"\n";
   cin>>n;
   cout<<"Enter the elements in the array"<<"\n";
   for (c = 0; c < n; c++)
   cin>>array[c];
   cout<<"Enter the location where you wish to insert an element"<<"\n";
   cin>>position;
   if(position<n && position>0)
   {
   cout<<"Enter the value to insert"<<"\n";
   cin>>value;
   for (c = n - 1; c >= position - 1; c--)
  array[c+1] = array[c];
   array[position-1] = value;
   {
   cout<<"Array after insertion is"<<"\n";
 
   for (c = 0; c <= n; c++)
      cout<<array[c]<<"\n"; 
   }
   }
   else
   cout<<"Invalid Input";
   return 0;
   
}