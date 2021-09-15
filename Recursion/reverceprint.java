import java.util.*;
import java.lang.Math;
public class Main
{
    public static int recursion(int num)
    {
        int powe=0;
        int dubli=num;
        while(dubli!=0)
        {
            powe++;
            dubli=dubli/10;
        }
        
        if(num==0)
        {
            return 0;
        }
        if(num>10)
        return ((num%10)*(int)(Math.pow(10,powe-1))+(recursion(num/10)));
        else{
            return (num%10);
        }
     
        
    }
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int number=s.nextInt();
	    int ans=recursion(number);
	    System.out.print(ans);
	
}
}