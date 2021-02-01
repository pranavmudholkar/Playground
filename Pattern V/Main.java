import java.util.*;
public class Main{

     public static void main(String []args){
        	Scanner sc=new Scanner (System.in);
	int p=sc.nextInt();
	int n=(p*p)+p;
	int g=p+p;
	int a[][]=new int[g][g];
//	int b[][]=new int[p][p];
	int n1=1,n2=0,h=1,m=1;
	for(int i=0;i<p;i++)
	{
	    for(int j=i;j<p;j++)
	    {
	        
	        a[i][j]=n1;
	        n1++;
	    }
	}
/*	for(int i=0;i<p;i++)
	{
	    for(int j=i;j<p;j++)
	    {
	        if(a[i][j]==0)
	          System.out.print("--");
	          else
	          System.out.print(a[i][j]+"*");
	    }
	    System.out.println();
	}*/
//	n1=11;
    for(int i=p-1;i>=0;i--)
	{
	    for(int j=(g-i)-h;j<=i+m;j++)
	    {
	        a[i][j]=n1;
	        n1++;
	    }
	    h++;
	    m++;
	    m++;
	}
	int j,k;
	for(j=0;j<p;j++)
		    {
		        
		    for(k=0;k<2*j;k++)
		    {
		        System.out.print("-");
		    }
		     for(k=0;k<2*p;k++)
		     {
		         if(a[j][k]!=0)
		            {
		                System.out.print(a[j][k]);
		                if(j!=0)
		                {
		                if(a[j][k+1]!=0)
		                {
		                    System.out.print("*");
		                }
		                }
		                else if(k<2*p-1)
		                {
		                    System.out.print("*");

		                }
		            }
		     }
		    // n1++;
		     //n2++;
		     System.out.println();
		    }
		
	}
}