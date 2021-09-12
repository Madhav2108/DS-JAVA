import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s= new Scanner(System.in);
		String sen=new String(s.nextLine());
		int count=0;
		int maxcount=0;
		char max=sen.charAt(0);
		char j=sen.charAt(0);
		char next="";
		int flag=0;
		for(int i=0;i<sen.length();i++)
		{
		    if(j==sen.charAt(i))
		    {
		        count++;
		    }
		    if(j!=sen.charAt(i)&&flag==0)
		    {
		        next=sen.charAt(i);
		        flag=1;
		    }
		    if(i==sen.length()-1)
		    {
		        if(count>maxcount)
		        {
		            max=j;
		            maxcount=count;
		            count=0;
		            flag=0;
		            j=next;
		        }
		    }
		}
	}
}
