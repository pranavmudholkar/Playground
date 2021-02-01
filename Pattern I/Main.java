#include <stdio.h>

int main()
{
    int a,count=1,flag=0;
    scanf("%d",&a);
    for(int i=0;i<8;i++)
    {
        for(int j=0;j<count;j++)
        {
            printf("%d",a);
        }
        printf("\n");
        if(flag==0 && count<4)
            {
                count++;
                a++;
            }
        else if(count==4 && flag==0)
        {
            flag=1;
        }
        else if(flag=1 && count<=4)
        {
            count--;
            a--;
        }
    }

    return 0;
}