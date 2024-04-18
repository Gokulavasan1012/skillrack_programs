import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    ArrayList<String> a=new ArrayList<>();
	    System.out.println("Enter a String:");
	    String input=sc.next();
	    combinations(input,"",a);
	    System.out.print(a);
	}

	public static void combinations(String s,String t,ArrayList<String> a)
	{
	    if(s.length()==0)
	    {
	        a.add(t);
	        return;
	    }
	    combinations(s.substring(1),t+s.charAt(0),a);
	    combinations(s.substring(1),t,a);
	}
}
