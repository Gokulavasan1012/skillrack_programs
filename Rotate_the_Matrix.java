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
		int t=n*n,i=0,j=0,p=0,q=0,count=n-1,r=n-1,s=1,flag=0;
		while(t>0)
		{
		    if(flag==0)
		    {
		        if(r==0)
		        {
		            flag=1;
		        }
		        while(count>0)
		        {
		            System.out.print("*");
		            count-=1;
		        }
		        count=--r;
		    }
		    else if(flag==1)
		    {
		        count=s;
		        while(count>0)
		        {
		            System.out.print("*");
		            count-=1;
		        }
		        s+=1;
		    }
		    while(i>=0 && j<n)
		    {
		        System.out.print(arr[i--][j++]+" ");
		        t--;
		    }
		    System.out.println();
            if(p<n-1)
            {
		        p+=1;
		        q=0;
            }
            else
            {
                q=q+1;
            }
            i=p;
            j=q;
		}
	}

}
