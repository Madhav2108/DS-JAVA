import java.util.*;
public class Main
{
    public static int recursion(int num)
    {
        if(num==1)
        {
            System.out.print(num);
            return num+1;
        }
        else{
            System.out.print(recursion(num-1));
            return num+1;
        }
    }
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int number=s.nextInt();
	    int ans =recursion(number);
}
}