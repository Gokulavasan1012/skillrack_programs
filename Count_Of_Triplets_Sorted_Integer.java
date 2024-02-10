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
        int t=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if(arr[k]>arr[j] && arr[j]>arr[i])
                    {
                        t+=1;
                    }
                }
            }
        }
        System.out.print(t);
	}
}
