import java.util.*;
public class Hello {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int arr1[][]=new int[r][c];
        int arr3[]=new int[c];
        int row=0,col=0,l=0;
        for(int i=0;i<c;i++)
        {
            col=0;
            for(int j=0;j<r;j++)
            {
                if(arr[j][i]%2!=0)
                {
                    arr1[col++][row]=arr[j][i];
                }
            }
            arr3[l++]=col;
            row+=1;
        }
        for(int i=0;i<c;i++)
        {
            if(arr3[i]>=c)
            {
                continue;
            }
            for(int j=0;j<r;j++)
            {
                if(arr[j][i]%2==0)
                {
                    arr1[arr3[i]][i]=arr[j][i];
                    arr3[i]+=1;
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
