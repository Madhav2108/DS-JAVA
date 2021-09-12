import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String sen=new String(s.nextLine());
		char str[] =sen.toCharArray();
		for(int i=0;i<str.length;i++)
		{
		    int j=str.length-1-i;
		    if(j>=i)
		    {
		        char temp=str[i];
		        str[i]=str[j];
		        str[j]=temp;
		        
		    }
		}
		System.out.println(String.valueOf(str));
	}
}