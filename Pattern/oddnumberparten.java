import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		for(int i=1;i<=2*size;i+=2)
		{
		    int dub=size;
		    int j=i;
		    while(dub>0)
		    {
		        System.out.print(j);
		        j+=2;
		        if(j>10)
		        {
		            j=j%10;
		        }
		        dub--;
		    }
		    System.out.println();
		}
	}
}