import java.util.*;
public class Hello {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int s=0,m=0,t=0;
        HashMap<Integer,Integer> a=new HashMap<>();
        while(sc.hasNextInt())
        {
            s=sc.nextInt();
            m=sc.nextInt();
            t=0;
            if(!a.containsKey(s))
            {
                a.put(s,m);
            }
            else
            {
                t=a.get(s);
                t=t+m;
                a.put(s,t);
            }
        }
        int max=0;
        for(Integer i:a.values())
        {
            if(i>max)
            {
                max=i;
            }
        }
        int count=0;
        for(Integer i:a.values())
        {
            if(i==max)
            {
              count+=1;
            }
        }
        int o=a.get(x);
        if(o==max && count==1)
        {
            System.out.print(0);
            System.exit(0);
        }
        System.out.print((max-o)+1);
	}
	
	
}
