import java.util.*;

public class Hello {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int arr[][]=new int[r][c];
		HashMap<Integer,Integer> a=new HashMap<Integer,Integer>();
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
                if(arr[i][j]==0)
                {
                    a.put(i,j);
                }
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(a.containsKey(i) && j==a.get(i))
                {
                    replace(arr,i,j,r,c);
                }
            }
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
	public static void replace(int arr[][],int rowIndex,int colIndex,int r,int c)
	{
	    for(int i=0;i<c;i++)
	    {
	        arr[rowIndex][i]=0;
	    }
	    for(int i=0;i<r;i++)
	    {
	        arr[i][colIndex]=0;
	    }
	}
}
