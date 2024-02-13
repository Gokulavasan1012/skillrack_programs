import java.util.*;
public class Hello {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String st[]=s.split(" ");
		String t=sc.next(),temp="";
        for(int i=1;i<st.length-1;i++)
        {
            if(st[i].equals(t))
            {
                temp=st[i-1];
                st[i-1]=st[i+1];
                st[i+1]=temp;
            }
        }
        for(int i=0;i<st.length;i++)
        {
            System.out.print(st[i]+" ");
        }
	}
	
	
}
