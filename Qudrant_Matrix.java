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
		int count=0,max=0,rs=0,cs=0,index=0;
		int arr1[]=new int[4];
        if(r%2==0 && c%2==0)
        {
            count=0;
            for(int i=0;i<r/2;i++)
            {
                for(int j=0;j<c/2;j++)
                {
                    if(arr[i][j]%2!=0)
                    {
                        count+=1;
                    }
                }
            }
            if(count>max)
            {
                max=count;
                index=0;
            }
            arr1[0]=count;
            count=0;
            for(int i=0;i<r/2;i++)
            {
                for(int j=c/2;j<c;j++)
                {
                    if(arr[i][j]%2!=0)
                    {
                        count+=1;
                    }
                }
            }
            if(count>max)
            {
                max=count;
                index=1;
            }
            arr1[1]=count;
            count=0;
            for(int i=r/2;i<r;i++)
            {
                for(int j=0;j<c/2;j++)
                {
                    if(arr[i][j]%2!=0)
                    {
                        count+=1;
                    }
                }
            }
            if(count>max)
            {
                max=count;
                index=2;
            }
            arr1[2]=count;
            count=0;
            for(int i=r/2;i<r;i++)
            {
                for(int j=c/2;j<c;j++)
                {
                    if(arr[i][j]%2!=0)
                    {
                        count+=1;
                    }
                }
            }
            if(count>max)
            {
                max=count;
                index=3;
            }
            arr1[3]=count;
            count=0;
            for(int i=0;i<4;i++)
            {
                if(arr1[i]==max)
                {
                    count+=1;
                }
            }
            if(count>=2)
            {
                System.out.print(-1);
                System.exit(0);
            }
            if(index==0)
            {
                print(0,r/2,0,c/2,arr);
            }
            else if(index==1)
            {
                print(0,r/2,c/2,c,arr);
            }
            else if(index==2)
            {
                print(r/2,r,0,c/2,arr);
            }
            else
            {
                print(r/2,r,c/2,c,arr);
            }
        }

	}
	public static void print(int rowStart,int rowEnd,int colStart,int colEnd,int arr[][])
	{
	    for(int i=rowStart;i<rowEnd;i++)
	    {
	        for(int j=colStart;j<colEnd;j++)
	        {
	            System.out.print(arr[i][j]+" ");
	        }
	        System.out.println();
	    }
	}
	
	
}
