import java.util.*;
import java.lang.Math;
public class Main
{
    public static String[] search(int n)
    {
        String a[]={""};
        switch(n)
        {
            case 2:
                 a[]={"a","b","c"};
                return a;
                break;
            case 3:
                 a[]={"d","e","f"};
                return a;
                break;
            case 4:
                a[]={"g","h","i"};
                return a;
                break;
            case 5:
                 a[]={"j","k","l"};
                return a;
                break;
            case 6:
                 a[]={"m","n","o"};
                return a;
                break;
            case 7:
                 a[]={"p","q","r","s"};
                return a;
                break;
            case 8:
                 a[]={"t","u","v"};
                return a;
                break;
            case 9:
                 a[]={"w","x","y","z"};
                return a;
                break;
        }
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
	System.out.println(ans);
	
	}
}