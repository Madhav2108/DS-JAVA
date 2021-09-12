import java.util.*;
public class Main
{
    static String reverce(String str)
    {
        for(int i=str.length()-1;i>=0;i--)
        {
            System.out.print(str.charAt(i));
        }
        System.out.print(" ");
        return "0";
    }
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String input1=new String(s.nextLine());
		int j=0;
		for(int i=0;i<input1.length();i++)
		{
		    if(input1.charAt(i)==' ')
		    {
		    reverce(input1.substring(j,i));
		     j=i;
		    }
		    if(i==input1.length()-1)
		    {
		    reverce(input1.substring(j,i+1));
		    }
		}
		
		
	}
}