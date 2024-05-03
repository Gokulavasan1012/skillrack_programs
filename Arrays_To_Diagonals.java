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
        int a=0;
        int b=n-1;
        int s=0;
        for(int i=0;i<n;i++)
        {
            s=0;
            for(int j=0;j<n;j++)
            {
                if(i==j && i+j==n-1)
                {
                    System.out.print(arr[a]);
                    a+=1;
                    b-=1;
                }
                else if(i==j)
                {
                    System.out.print(arr[a]);
                    a+=1;
                }
                else if(i+j==n-1)
                {
                    System.out.print(arr[b]);
                    b-=1;
                }
                else
                {
                    String r=String.valueOf(arr[s]);
                    for(int q=0;q<r.length();q++)
                    {
                        System.out.print("*");
                    }
                }
                s+=1;
            }
            System.out.println();
        }
	}
	
}
