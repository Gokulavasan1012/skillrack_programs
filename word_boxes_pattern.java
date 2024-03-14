import java.util.*;
public class Hello {

    public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String arr[]=sc.nextLine().split(" ");
		int n=arr.length;
		System.out.print("+");
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<arr[i].length();j++)
		    {
		        System.out.print("-");
		    }
		    System.out.print("+");
		}
		System.out.println();
		System.out.print("|");
		for(int i=0;i<n;i++)
		{
		    System.out.print(arr[i]+"|");
		}
		System.out.println();
		System.out.print("+");
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<arr[i].length();j++)
		    {
		        System.out.print("-");
		    }
		    System.out.print("+");
		}
		

	}
}
