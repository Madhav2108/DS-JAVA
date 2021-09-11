import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String input1=new String(s.nextLine());
		String input2=new String(s.nextLine());
		int count=0;
		if(input2.length()==input1.length())
		{
		for(int i=0;i<input2.length();i++)
		{
		    for(int j=0;j<input1.length();j++)
		    {
		        if(input2.charAt(i)==input1.charAt(j))
		        {
		          count++;
		        }
		    }
		}
		if(count==input2.length())
		{
		    System.out.print("True");
		}
		else{
		    System.out.print("False");
		}
		}
		else{
		    System.out.print("False");
		}
	}
}