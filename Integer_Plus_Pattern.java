import java.util.*;
public class Hello {

    public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(n-i+" ");
            }
            for(int j=n-i;j>1;j--)
            {
                System.out.print(j+" ");
            }
            for(int j=1;j<n-i;j++)
            {
                System.out.print(j+" ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print(n-i+" ");
            }
            System.out.println();
        }
        for(int i=1;i<=n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(i+1+" ");
            }
            for(int j=i+1;j>=1;j--)
            {
                System.out.print(j+" ");
            }
            for(int j=2;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            for(int j=0;j<=n-i-1;j++)
            {
                System.out.print(i+1+" ");
            }
            System.out.println();
        }
	}
}
