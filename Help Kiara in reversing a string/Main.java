#include <iostream>
using namespace std;
int main()
{
char str[100], rev[100];     
int count = 0, j, i;    
cin.getline(str,100);
  while(str[count]!=0)
  {
    count++;
  }
  j=count-1;
  for (i = 0; i < count; i++) 
    {
        rev[i] = str[j];
        j--;
    }
    cout << rev;
}