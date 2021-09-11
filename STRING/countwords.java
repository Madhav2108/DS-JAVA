import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String sen=new String(s.nextLine());
		int count=1;
		for(int i=0;i<sen.length();i++)
		{
		    if(sen.charAt(i)==' ')
		    {
		        count++;
		    }
		    
		}
		System.out.println(count);
	}
}