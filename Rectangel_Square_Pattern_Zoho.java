import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int r=s;
		int n=s+s-1;
		int arr[][]=new int[n][n];
		int fr=0,fc=0,lr=n-1,lc=n-1;
		for(int t=0;t<r;t++)
		{
    		for(int i=fr;i<=lr;i++)
    		{
    		    for(int j=fc;j<=lc;j++)
    		    {
    		        if(i==fr || j==fc || i==lr || j==lc)
        		    {
        		       arr[i][j]=s;
        		    }
    		    }
    		}
    		fr+=1;
    		fc+=1;
    		lr-=1;
    		lc-=1;
    		s-=1;
		}
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        System.out.print(arr[i][j]);
		    }
		    System.out.println();
		}
	}
	
	
	
}
