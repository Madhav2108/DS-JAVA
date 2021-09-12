import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String input1=new String(s.nextLine());
		char j=input1.charAt(0);
		System.out.print(j);
		for(int i=1;i<input1.length();i++)
		{
		   if(j!=input1.charAt(i))
		   {
		       j=input1.charAt(i);
		       System.out.print(j);
		   }
		}
		
	}
}