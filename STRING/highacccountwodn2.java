import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s= new Scanner(System.in);
		String sen=new String(s.nextLine());
		int maxcount=0;
		char maxchar='a';
		for(int i=0;i<sen.length();i++)
		{
		    int count=0;
		    if(sen.charAt(i)=='0')
		    {
		        i++;
		    }
		    for(int j=i+1;j<sen.length();j++)
		    {
		        if(sen.charAt(i)==sen.charAt(j))
		        {
		            count++;
		            
		        }
		        if(count>maxcount)
		        {
		            maxcount=count;
		            maxchar=sen.charAt(i);
		        }
		    }
		    sen.replace('0',sen.charAt(i));
		}
		System.out.println(maxchar);
		System.out.print(maxcount+1);
	}