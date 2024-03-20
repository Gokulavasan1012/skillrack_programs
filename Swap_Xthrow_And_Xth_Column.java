import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        arr[i][j]=sc.nextInt();
		    }
		}
		int a=sc.nextInt()-1,t;
		for(int i=0;i<n;i++)
		{
		    t=arr[a][i];
		    arr[a][i]=arr[i][a];
		    arr[i][a]=t;
		}
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        System.out.print(arr[i][j]+" ");
		    }
		    System.out.println();
		}

	}
}
