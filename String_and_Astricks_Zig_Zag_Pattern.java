import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=sc.nextInt(),l=0;
		for(int i=0;i<n;i++)
		{
		    if(i%2!=0)
		    {
    		    for(int j=0;j<=i;j++)
    		    {
    		        if(l<s.length())
    		        {
    		            System.out.print(s.charAt(l++));
    		        }
    		        else
    		        {
    		            System.out.print("#");
    		        }
    		    }
    		    for(int j=i+1;j<n;j++)
    		    {
    		        System.out.print("*");
    		    }
    		    System.out.println();
		    }
		    else
		    {
		        for(int j=0;j<n-i-1;j++)
		        {
		            System.out.print("*");
		        }
		        for(int j=n-i-1;j<n;j++)
		        {
		            if(l<s.length())
		            {
		                System.out.print(s.charAt(l++));
		            }
		            else
		            {
		                System.out.print("#");
		            }
		        }
		        System.out.println();
		    }
		}
	}
}
