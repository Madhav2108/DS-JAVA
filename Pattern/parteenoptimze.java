import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int count=0;
		for(int i=0;i<2*size;i+=2)
		{
		    int j=i+1;
		    int k=i+2;
		    if(j>size)
		    {
		        j=size-j%size;
		    }
		    if(k>size)
		    {
		        k=size-k%size;
		    }
		    if(k%size==0)
		    {
		        k=0;
		    }
		    while(j>0)
		    {
		           System.out.print("*");
		            j--;
		    }
		    System.out.println();
		    while(k>0)
		    {
		         System.out.print("*");
		            k--;
		    }
		    System.out.println();
		}
	}
}
