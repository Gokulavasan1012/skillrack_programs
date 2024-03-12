import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		long a=0;
		for(int i=0;i<s.length();i++)
		{
		    a+=Math.pow((s.charAt(i)-48),s.length());
		}
        System.out.print(a);
	}
}
