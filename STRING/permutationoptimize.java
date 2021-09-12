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
		    int j=count;
		        if(input2.charAt(j)==input1.charAt(i))
		        {
		          count++;
		          if(count<input2.length()-1)
		          {
		              i=0;
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