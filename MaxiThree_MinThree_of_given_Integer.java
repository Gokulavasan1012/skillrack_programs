import java.util.*;
public class Hello {
    public static void main(String[] args) {
        
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    ArrayList<Integer> a=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            a.add(sc.nextInt());
        }
        while(a.size()>1)
        {
            a=maxThree(a);
            a=minThree(a);
        }
      System.out.print(a.get(0));
	}
	public static ArrayList<Integer> maxThree(ArrayList<Integer> a)
	{
	    ArrayList<Integer> b=new ArrayList<Integer>();
	    for(int i=0;i<a.size()-2;i+=3)
	    {
	        b.add(Math.max(a.get(i),Math.max(a.get(i+1),a.get(i+2))));
	    }
	    if(a.size()%3==2)
	    {
	        b.add(Math.max(a.get(a.size()-2),a.get(a.size()-1)));
	    }
	    else if(a.size()%3==1)
	    {
	        b.add(a.get(a.size()-1));
	    }
	    return b;
	}
	public static ArrayList<Integer> minThree(ArrayList<Integer> a)
	{
	    ArrayList<Integer> b=new ArrayList<Integer>();
	    for(int i=0;i<a.size()-2;i+=3)
	    {
	        b.add(Math.min(a.get(i),Math.min(a.get(i+1),a.get(i+2))));
	    }
	    if(a.size()%3==2)
        {
            b.add(Math.min(a.get(a.size()-2),a.get(a.size()-1)));
        }
        else if(a.size()%3==1)
        {
            b.add(a.get(a.size()-1));
        }
	    return b;
	}
	
	
	
}
