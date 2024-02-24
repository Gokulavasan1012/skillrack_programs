import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		}
		int arr1[]=new int[n];
		int j=n-1;
		for(int i=0;i<n;i++)
		{
		    arr1[i]=sc.nextInt();
		    if(arr1[i]!=arr[j])
		    {
		        System.out.print(0);
		        System.exit(0);
		    }
		    j-=1;
		}
		System.out.print(1);

	}
	
}
