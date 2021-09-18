import java.util.*;
import java.lang.Math;
public class Main
{
    
    public static boolean convert(String s,int ans)
    {
        if(ans==s.length()-1)
        {
            if(s.charAt(ans)=='a'||(s.charAt(ans)=='b')&&(s.charAt(ans-1)=='b'))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        if(s.charAt(0)=='a')
        {
            if(s.charAt(ans)=='a')
            {
                if(s.charAt(ans+1)=='a'||(s.charAt(ans+1)=='b')&&(s.charAt(ans+2)=='b'))
                {
                    if(s.charAt(ans+1)=='a')
                    {
                        return convert(s,ans+1);
                    }
                    else{
                        return convert(s,ans+2);
                    }
                    
                }
                
                else
                {
                    return false;
                }
                
            }
            else{
                if(s.charAt(ans+1)=='a'&&s.charAt(ans-1)=='b')
                {
                    return convert(s,ans+1);
                }
                else{
                    return false;
                }
            }
        }
        else
        {
            return false;
        }
    }
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String sen=new String(s.nextLine());
	boolean ans=convert(sen,0);
	System.out.print(ans);
	}
}