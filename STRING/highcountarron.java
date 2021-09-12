import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s= new Scanner(System.in);
		String sen=new String(s.nextLine());
		int max=0;
		char maxchar='a';
		int str[]=new int[26];
		for(int i=0;i<sen.length();i++)
		{
		    str[sen.charAt(i)-97]++;
		}
		for(int i=0;i<str.length;i++)
		{
		    if(str[i]>max)
		    {
		        max=str[i];
		        maxchar=(char)(97+i);
		    }
		}
		System.out.println(maxchar);
		System.out.print(max);
	}
}