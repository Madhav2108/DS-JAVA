import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		for(int i=0;i<size;i++)
		{
		    int j=i+1;
		    int k=size-j;
		    int p=j;
		    int door=0;
		    while(k>0||p>=j)
		    {
		        if(k>0)
		        {
		            System.out.print(" ");
		            k--;
		        }
		        else{
		            if(p>=2*j)
		            {
		                door=1;
		                p=p-2;
		            }
		            if(door==0)
		            {
		                System.out.print(p);
		                p++;
		            }
		            if(door==1&&p>=j)
		            {
		                System.out.print(p);
		                p--;
		            }
		        }
		    }
		    System.out.println();
		}
	}
}
