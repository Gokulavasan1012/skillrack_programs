import java.util.*;
public class Hello {

    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt(),a=0,s=0;
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=sc.nextInt();
	        if(arr[i]>a)
	        {
	            a=arr[i];
	            s=i;
	        }
	    }
	    int left=s-1,right=s+1;
	    while(left>=0 || right<n)
	    {
          if(arr[s]==0)
          {
            break;
          }
	        if(left>=0)
	        {
                arr[left]+=1;
                arr[s]-=1;
                left-=1;
	        }
          if(arr[s]==0)
          {
            break;
          }
          if(right<n)
          {
              arr[right]+=1;
              arr[s]-=1;
              right+=1;
          }
	    }
	    for(int i=0;i<n;i++)
	    {
	        System.out.print(arr[i]+" ");
	    }
	}
}
