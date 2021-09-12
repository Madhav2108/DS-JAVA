import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String sen=new String(s.nextLine());
		for(int i=0;i<sen.length();i++)
		{
		    int j=i;
		    while(j<sen.length())
		    {
		        int k=i;
		        while (k<=j)
		        {
		            System.out.print(sen.charAt(k));
		            k++;
		        }
		        System.out.println();
		        j++;
		    }
		}
	}
}