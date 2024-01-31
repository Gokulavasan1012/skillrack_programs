import java.util.*;
public class Hello {

    public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		long n=sc.nextInt(),t=0;
		for(long i=0;i<n;i++)
		{
		    if(i%2==0)
		    {
		        t=0;
    		    for(long j=1;j<n-i;j++)
    		    {
    		       System.out.print(j+"+");
    		       t+=j;
    		    }
    		    t=t+(n-i);
    		    System.out.print((n-i)+"="+t);
		    }
		    else
		    {
		        t=1;
    		    for(int j=1;j<n-i;j++)
    		    {
    		        System.out.print(j+"*");
    		        t=t*j;
    		    }
    		    t=t*(n-i);
    		    System.out.print((n-i)+"="+t);
		    }
		    System.out.println();
		}
	}



}
