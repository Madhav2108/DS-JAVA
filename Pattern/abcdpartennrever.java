import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		char k=(char)('A'+size-1);
		
		for(int i=0;i<size;i++)
		{
		    char t=(char)(k);
		    int j=i+1;
		    while(j>0)
		    {
		           System.out.print(t);
		            j--;
		            t++;
		    }
		    System.out.println();
		    k--;
		}
	}
}