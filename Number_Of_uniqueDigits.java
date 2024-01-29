import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    if(n==0)
	    {
	        System.out.print(1);
	    }
	    else if(n==1)
	    {
	        System.out.print(10);
	    }
	    else
	    {
	        int t=9,r=9;
	        n-=1;
	        while(n>0)
	        {
	            t=t*r;
	            r-=1;
	            n-=1;
	        }
	        System.out.print(t);
	    }
	}
}
