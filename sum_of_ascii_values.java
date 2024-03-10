import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char arr[]=sc.next().toCharArray();
		int total=0;
		for(int i=0;i<arr.lenth;i++)
		{
		    total=total+arr[i];
		}
		System.out.print(total);

	}
}
