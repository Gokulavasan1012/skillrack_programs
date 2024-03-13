import java.util.*;
public class Hello {

    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int a=s.charAt(0)-48;
		for(int i=0;i<a;i++)
		{
		    for(int j=0;j<s.length();j++)
		    {
		        for(int r=0;r<a;r++)
		        {
		            System.out.print(s.charAt(j));
		        }
		    }
		    System.out.println();
		}
	}
	


	
}
