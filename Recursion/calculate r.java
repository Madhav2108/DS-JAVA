import java.util.*;
public class Main
{
    public static int recursion(int num,int pow)
    {
        if(pow==0)
        {
            return 1;
        }
        else{
            num=num*(recursion(num,pow-1));
            return num;
        }
    }
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int number=s.nextInt();
	    int power=s.nextInt();
	    int ans=recursion(number,power);
	    System.out.print(ans);
	
}
}