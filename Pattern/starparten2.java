import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		for(int i=0;i<size;i++)
		{
		    int j=i+1;
		    while(j>0)
		    {
		        System.out.print("*");
		        j--;
		    }
		    System.out.println();
		}
		for(int i=size;i>1;i--)
		{
		    int j=i-1;
		    while(j>0)
		    {
		        System.out.print("*");
		        j--;
		    }
		    System.out.println();
		}
	}
}