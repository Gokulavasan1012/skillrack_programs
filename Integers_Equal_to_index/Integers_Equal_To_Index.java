import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a,flag=-1;
		for(int i=0;i<n;i++)
		{
		    a=sc.nextInt();
		    if(a==i)
		    {
		        System.out.print(a+" ");
		        flag=1;
		    }
		}
		if(flag==-1)
		{
		    System.out.print(flag);
		}

	}
}
