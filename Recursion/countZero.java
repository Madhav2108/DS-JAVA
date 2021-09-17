import java.util.*;
import java.lang.Math;
public class Main
{
    
    public static int mul(int num1,int ans)
    {
        if(num1==0)
        {
            return ans;
        }
        if(num1%10==0)
        {
            ans++;
        }
        ans =mul(num1/10,ans);
        return ans;
        
    }
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int num1=s.nextInt();
	int ans =mul(num1,0);
	System.out.print(ans);
	}
}