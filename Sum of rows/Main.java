#include<iostream>
using namespace std;
int main()
{
 int i,j,row,col;
    cin>>row>>col;
    int arr[row][col];
    for(i=0;i<row;i++)
     {
         for(j=0;j<col;j++)
         {
         cin>>arr[i][j];
         }
     }
  for(i=0;i<row;i++)
     {
      int sum1=0;
         for(j=0;j<col;j++)
         {
         sum1=sum1+arr[i][j];
         }
      cout<<sum1<<"\n";
    }
}