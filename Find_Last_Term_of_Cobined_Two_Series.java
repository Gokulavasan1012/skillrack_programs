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
        Arrays.sort(arr);
        int a=0;
        for(int i=0;i<n-1;i+=2)
        {
            if(arr[i]!=arr[i+1])
            {
                a=arr[i-1];
                break;
            }
        }
        if(a==0)
        {
            a=arr[n-2];
        }
        System.out.print(arr[n-1]+" "+a);
	}
}
