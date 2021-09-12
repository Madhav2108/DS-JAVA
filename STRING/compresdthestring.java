import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s= new Scanner(System.in);
		String sen=new String(s.nextLine());
		int count=1;
		for(int i=1;i<sen.length();i++)
		{
		    if(sen.charAt(i-1)!=sen.charAt(i))
		    {
		        System.out.print(sen.charAt(i-1));
		        if(i==sen.length()-1)
		        {
		            System.out.print(sen.charAt(i));
		        }
		        
		        if(count>1)
		        System.out.print(count);
		        count=1;
		    }
		    else if(i==sen.length()-1)
		    {
		        count++;
		        System.out.print(sen.charAt(i));
		        System.out.print(count);
		    }
		    else{
		        count++;
		    }
		}
	}
}
