import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		for(int i=1;i<=size;i++)
		{
		    int sum=0;
		    int p=1;
		    int j=i;
		    while(p<=j)
		    {
		        if(p==1)
		        {
		        System.out.print(p);
		        sum=sum+p;
		        p++;
		        }
		        else
		        {
		        System.out.print("+");
		        System.out.print(p);
		        sum=sum+p;
		        p++;
		        }
		    }
		    System.out.print("=");
		    System.out.print(sum);
		    System.out.println();
		    
		}
	}
}