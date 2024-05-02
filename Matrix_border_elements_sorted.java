import java.util.*;
public class Hello {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt(),n=0;
		int arr[][]=new int[r][c];
		int arr1[]=new int[r*2+(c-2)*2];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
                if(i==0 || j==0 || i==r-1 || j==c-1)
                {
                    arr1[n++]=arr[i][j];
                }
            }
        }
        Arrays.sort(arr1);
        n=0;
        for(int i=0;i<c;i++)
        {
            arr[0][i]=arr1[n++];
        }
        for(int i=1;i<r-1;i++)
        {
            arr[i][c-1]=arr1[n++];
        }
        for(int i=c-1;i>=0;i--)
        {
            arr[r-1][i]=arr1[n++];
        }
        for(int i=r-2;i>=1;i--)
        {
            arr[i][0]=arr1[n++];
        }
    	for(int i=0;i<r;i++)
    	{
    	    for(int j=0;j<c;j++)
    	    {
    	        System.out.print(arr[i][j]+" ");
    	    }
    	    System.out.println();
    	}
    }
    
}
