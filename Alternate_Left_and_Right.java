import java.util.*;
public class Hello {
    
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n],max=0,t=0;
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		    if(arr[i]>max)
		    {
		        max=arr[i];
		        t=i;
		    }
		}
		System.out.print(max+" ");
		int left=t-1;
		int right=t+1;
		while(left>=0 || right<n)
		{
		    if(left>=0)
		    {
		        System.out.print(arr[left--]+" ");
		    }
		    if(right<n)
		    {
		        System.out.print(arr[right++]+" ");
		    }
		}
		
		

	}
	
	
	
}
