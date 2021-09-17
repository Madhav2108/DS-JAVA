import java.util.*;
import java.lang.Math;
public class Main
{
    
    public static boolean check(String sen,int start,int end)
    {
        if(sen.charAt(start)!=sen.charAt(end))
        {
            return false;
        }
        else if(start>end)
        {
            return true;
        }
        else{
             check(sen,start+1,end-1);
        }
        return true;
        
        
    }
    
    
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String sen=new String(s.nextLine());
	boolean ans =false;
	ans =check(sen,0,sen.length()-1);
	System.out.print(ans);
	}
}