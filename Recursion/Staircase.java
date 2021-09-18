import java.util.*;
import java.lang.Math;
public class Main
{
    public static int ways(int num)
    {
        if(num==0||num==1)
        {
            return 1;
        }
        if(num==2)
        {
            return 2;
        }
        if(num==3)
        {
            return 4;
        }
            return ways(num-1)+ways(num-2)+ways(num-3);
        
    }
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int count=s.nextInt();
	int ans=ways(count);
	System.out.print(ans);
	}
}