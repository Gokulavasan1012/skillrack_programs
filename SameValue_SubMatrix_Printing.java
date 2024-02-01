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
	    int t=sc.nextInt(),s=0,element=0;
        for(int i=0;i<r-t+1;i++)
        {
            for(int p=0;p<c-t+1;p++)
            {
                s=0;
                element=arr[i][p];
                y:for(int j=i;j<t+i;j++)
                {
                    for(int q=p;q<t+p;q++)
                    {
                        if(arr[j][q]!=element)
                        {
                            s=1;
                            break y;
                        }
                    }
                }
                System.out.println();
                if(s==0)
                {
                    System.out.print("yes");
                    System.exit(0);
                }
            }
        }
        System.out.print("no");
	}
	
	
	
}
