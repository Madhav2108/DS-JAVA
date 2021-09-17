import java.util.*;
import java.lang.Math;
public class Main
{
    
    public static int convert(String s,int ans)
    {
        if(ans==0)
        {
            return (int)(s.charAt(ans)-48)*(int)(Math.pow(10,(s.length()-ans-1)));
        }
       return convert(s,ans-1)+(int)(s.charAt(ans)-48)*(int)(Math.pow(10,(s.length()-ans-1)));
    }
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String sen=new String(s.nextLine());
	int ans=convert(sen,sen.length()-1);
	System.out.print(ans);
	}
}