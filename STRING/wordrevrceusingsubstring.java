import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String sen=new String(s.nextLine());
		int lastindex=sen.length();
		for(int i=sen.length()-1;i>=0;i--)
		{
		    if(sen.charAt(i)==' '||i==0)
		    {
		        if(i==0)
		        {
		            i--;
		        }
		        System.out.print(sen.substring(i+1,lastindex));
		        lastindex=i;
		        System.out.print(" ");
		    }
		}
	}
}