import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		for(int i=0;i<=2*size;i++)
		{
		    int j=i;
		    int p=0;
		    int gate=0;
		    if(j>size)
		    {
		        if(j==2*size)
		        {
		            j=0;
		        }
		        else{
		        j=size-j%size;
		        }
		    }
		    while(p>=0)
		    {
		        if(p>j)
		        {
		            gate=1;
		            p=p-2;
		        }
		        if(p==0&&gate==0)
		        {
		            System.out.print("*");
		            p++;
		        }
		        else{
		        if(p==0&&gate==1)
		        {
		            System.out.print("*");
		            p--;
		        }
		        else if(p<=j&&gate==0)
		        {
		            System.out.print(p);
		            p++;
		        }
		        else if(p>0){
		            System.out.print(p);
		            p--;
		        }
		        }
		        
		    }
		    System.out.println();
		}
		
		
	}
}
