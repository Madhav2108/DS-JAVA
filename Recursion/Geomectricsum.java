import java.util.*;
import java.lang.Math;
public class Main
{
    public static double GeometricSum(int num,double ans)
    {
        if(ans==(1/(Math.pow(2.0,num))))
        {
            return ans;
        }
        return ans+GeometricSum(num,ans/2.0);
        
    }
	public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
	int number=s.nextInt();
	double ans =1;
	ans =GeometricSum(number,ans);
	System.out.print(ans);
	}
}
