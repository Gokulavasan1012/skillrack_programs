import java.util.*;
public class Hello {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		for(long i=1;i<=n*3;i+=3)
		{
		    System.out.print((i)*(i+1)*(i+2)+" ");
		}
	}
}
