import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int firstTerm=2,commonDiff=1;
		for(int i=0;i<n;i++)
		{
		    System.out.print(firstTerm+" ");
		    commonDiff+=2;
		    firstTerm+=commonDiff;
		}

	}



}
