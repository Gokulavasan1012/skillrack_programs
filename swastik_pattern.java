import java.util.*;
public class Hello {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt(),r=0,c=0;
		int arr[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        arr[i][j]=sc.nextInt();
		        if(arr[i][j]==x)
		        {
		            r=i;
		            c=j;
		        }
		    }
		}
		int a=r,b=c;
		if(a!=0)
		{
        	while(a>=0 && b<n)
        	{
        	    if(a==0)
        	    {
        	        System.out.print(arr[a][b++]+" ");
        	    }
        	    else
        	    {
        	        System.out.print(arr[a--][b]+" ");
        	    }
        	}
		}
		else
		{
		    System.out.print(arr[a][b]);
		}
		a=r;
		b=c;
 		System.out.println();
 		if(b!=n-1)
 		{
            while(a<n && b<n)
            {
                if(b==n-1)
                {
                    System.out.print(arr[a++][b]+" ");
                }
                else
                {
                    System.out.print(arr[a][b++]+" ");
                }
            }
            System.out.println();
 		}
 		else
 		{
 		    System.out.println(arr[r][c]);
 		}
		a=r;
		b=c;
		if(a!=n-1)
		{
    		while(a<n && b>=0)
    		{
    		    if(a==n-1)
    		    {
    		        System.out.print(arr[a][b--]+" ");
    		    }
    		    else
    		    {
    		        System.out.print(arr[a++][b]+" ");
    		    }
    		}
		}
		else
		{
		    System.out.print(arr[a][b]);
		}
        a=r;
        b=c;
        System.out.println();
        if(b!=n-1)
        {
            while(b>=0 && a>=0)
            {
                if(b==0)
                {
                    System.out.print(arr[a--][b]+" ");
                }
                else
                {
                    System.out.print(arr[a][b--]+" ");
                }
            }
        }
        else
        {
            System.out.print(arr[a][b]);
        }
	}
	
}
