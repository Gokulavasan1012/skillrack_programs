import java.util.*;
public class Hello {
    public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int t=sc.nextInt();
		int arr[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int i=0,j=0,s=Math.min(r,c)/2,a=t,fc,sec,tc,forc;
        while(s>0)
        {
            while(a>0)
            {
                fc=arr[i][j];
                sec=arr[i][c-j-1];
                tc=arr[r-i-1][c-j-1];
                forc=arr[r-i-1][j];
                arr[i][j]=forc;
                arr[i][c-j-1]=fc;
                arr[r-i-1][c-j-1]=sec;
                arr[r-i-1][j]=tc;
                a-=1;
            }
            i+=1;
            j+=1;
            s-=1;
            a=t;
            }
    	for(int p=0;p<r;p++)
    	{
    	    for(int q=0;q<c;q++)
    	    {
    	        System.out.print(arr[p][q]+" ");
    	    }
    	    System.out.println();
    	}
    }

    
}
