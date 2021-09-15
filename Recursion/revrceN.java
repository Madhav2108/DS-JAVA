import java.util.*;
import java.lang.Math;
public class Main
{
    public static int recursion(int num)
    {
        if(num==0)
        return 0;
        if(num==1)
        {
            return 1;
        }
        return((num)*(int)(Math.pow(10,num-1))+recursion(num-1));
  
    }
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int number=s.nextInt();
	    int ans=recursion(number);
	    System.out.print(ans);
	
}
}