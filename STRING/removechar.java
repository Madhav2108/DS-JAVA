import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String input1=new String(s.nextLine());
		char j=s.next().charAt(0);
		String ans="";
		for(int i=0;i<input1.length();i++)
		{
		   if(input1.charAt(i)!=j)
		   {
		       ans=ans+input1.charAt(i);
		   }
		}
		System.out.print(ans);
		
	}
}