import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String sen=new String(s.nextLine());
		for(int i=0;i<sen.length();i++)
		{
		    if(sen.charAt(i)!=sen.charAt(sen.length()-1-i))
		    {
		        System.out.println("String is not palindrone");
		       
		        return;
		    }
		    
		}
		    System.out.println("String is  palindrone");
	}
}