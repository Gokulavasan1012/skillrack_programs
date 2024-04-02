import java.util.*;
public class Hello {
    public static void main(String[] args) {
        
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int n=sc.nextInt();
		int arr[][]=new int[n][4];
	    int arr1[][]=new int[r][c];
	    for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<4;j++)
	        {
	            arr[i][j]=sc.nextInt()-1;
	        }
	    }
	    int x1=0,y1=0,x2=0,y2=0;
        for(int i=0;i<n;i++)
        {
            x1=arr[i][0];
            y1=arr[i][1];
            x2=arr[i][2];
            y2=arr[i][3];
            for(int s=x1;s<=x2;s++)
            {
                for(int j=y1;j<=y2;j++)
                {
                    arr1[s][j]+=1;
                }
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
    }
}
