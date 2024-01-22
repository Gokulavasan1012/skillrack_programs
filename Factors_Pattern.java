import java.util.*;
public class Hello {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int factors[]=new int[100];
		int s=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                factors[s++]=i;
            }
        }
        int len=s+(s-1);
        int arr[][]=new int[len][len];
        int t=0;
        for(int i=0;i<s;i++)
        {
            for(int j=i;j<len-i;j++)
            {
                for(int r=i;r<len-i;r++)
                {
                    if(j==i || r==i || r==len-i-1 || j==len-i-1)
                    {
                        arr[j][r]=factors[i];
                    }
                }
            }
        }
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
	}
}
