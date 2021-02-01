#include<iostream>
using namespace std;
int main()
{
 int i,j,row,col,f,r,max;
    cin>>row>>col;
    int arr[row][col];
    for(i=0;i<row;i++)
     {
         for(j=0;j<col;j++)
         {
         cin>>arr[i][j];
         }
     }
  max=arr[0][0];
    for(i=0;i<row;i++)
    {
     for(j=0;j<col;j++)
     {
     if(max<arr[i][j])
        max=arr[i][j];
     }
     }
  cout<<"The maximum element is "<<max;
}