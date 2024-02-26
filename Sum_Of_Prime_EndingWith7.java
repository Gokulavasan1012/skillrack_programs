import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int t=0;
		for(int i=7;i<=n;i++)
		{
		    if(isPrime(i)==1 && i%10==7)
		    {
		        t=t+i;
		    }
		}
        System.out.print(t);
	}
	public static int isPrime(int a)
	{
	    for(int i=2;i<=(int)Math.sqrt(a);i++)
	    {
	        if(a%i==0)
	        {
	            return 0;
	        }
	    }
	    return 1;
	}
}
