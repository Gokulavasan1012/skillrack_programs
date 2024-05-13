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
	    int l=sc.nextInt();
	    int arr1[][]=new int[l][l];
	    for(int i=0;i<l;i++)
	    {
	        for(int j=0;j<l;j++)
	        {
	            arr1[i][j]=sc.nextInt();
	        }
	    }
	    int row=0,col=0,flag=0;
	    a:for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<n;j++)
	        {
	            row=0;
	            col=0;
	            flag=0;
	            s:for(int s=i;s<i+l;s++)
	            {
	                for(int t=j;t<j+l;t++)
	                {
	                    if(arr[s][t]!=arr1[row][col++])
	                    {
	                        flag=1;
	                        break s;
	                    }
	                }
	                row+=1;
	                col=0;
	            }
	            if(flag==0)
	            {
	                for(int s=i;s<i+l;s++)
	                {
	                    for(int t=j;t<j+l;t++)
	                    {
	                        arr[s][t]=-1;
	                    }
	                }
	                break a;
	            }
	        }
	    }
	    for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<n;j++)
	        {
	            if(arr[i][j]==-1)
	            {
	                System.out.print("* ");
	            }
	            else
	            {
	                System.out.print(arr[i][j]+" ");
	            }
	        }
	        System.out.println();
	    }

	}
}
