import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int m=sc.nextInt();
		int n=sc.nextInt();
		for(int i=0;i<m;i++)
		{
		    gridPrint(r,c,c*(n)+(n-1),n);
		    if(i<m-1)
		    {
    		    for(int s=0;s<n;s++)
    		    {
    		        for(int j=0;j<c;j++)
    		        {
    		            System.out.print("-");
    		        }
    		        if(s<(n-1))
    		        {
    		            System.out.print("+");
    		        }
    		    }
    		    System.out.println();
		    }
		}
	}
	public static void gridPrint(int a,int t,int b,int n)
	{
	    int r=t;
	    for(int i=0;i<a;i++)
	    {
	        for(int j=0;j<b;j++)
	        {
	            if(j==t)
	            {
	                System.out.print("|");
	                t=t+r+1;
	            }
	            else
	            {
	                System.out.print("*");
	            }
	        }
	        t=r;
	        System.out.println();
	    }
	}
}
