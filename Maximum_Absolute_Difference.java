import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a,b=0,t=-1;
		for(int i=0;i<n;i++)
		{
		    a=sc.nextInt();
		    if(i>0)
		    {
		        if(Math.abs(a-b)>t)
		        {
		            t=Math.abs(a-b);
		        }
		    }
		    b=a;
		}
        System.out.print(t);
	}
}
