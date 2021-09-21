import java.util.*;
import java.lang.Math;
public class Main
{
    public static String[] search(int n)
    {

        switch(n)
        {
            case 2:
                String b[]={"a","b","c"};
                return b;
               
            case 3:
                String a[]={"d","e","f"};
                return a;
                
            case 4:
                String c[]={"g","h","i"};
                return c;
               
            case 5:
                String d[]={"j","k","l"};
                return d;
                
            case 6:
                String e[]={"m","n","o"};
                return e;
              
            case 7:
                String f[]={"p","q","r","s"};
                return f;
                
            case 8:
                String g[]={"t","u","v"};
                return g;
               
            case 9:
                String h[]={"w","x","y","z"};
                return h;
               
        }
        String i[]={""};
        return i;
    }
    public static String[] phone(int num)
    {
        if(num==0)
        {
            String a[]={""};
            return a;
        }
        String first[]=phone(num/10);
        String second[]=search(num%10);
        String last[]= new String[first.length*second.length];
        int k=0;
        for(int i=0;i<first.length;i++)
        {
            for(int j=0;j<second.length;j++)
                {
                    last[k]=first[i]+second[j];
                    k++;
                }
        }
        return last;
    }
    
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int count=s.nextInt();
	String ans[]=phone(count);
	for(int i=0;i<ans.length;i++)
	{
	    System.out.println(ans[i]);
	}
	
	}
}