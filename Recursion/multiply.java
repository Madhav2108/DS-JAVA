import java.util.*;
import java.lang.Math;
public class Main
{
    
    public static int mul(int num1,int num2)
    {
        return num1*num2;
    }
    
    
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int num1=s.nextInt();
	int num2=s.nextInt();
	int ans =mul(num1,num2);
	System.out.print(ans);
	}
}