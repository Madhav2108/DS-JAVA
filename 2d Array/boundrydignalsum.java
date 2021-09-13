import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int size=s.nextInt();

	    int arr[][]=new int[size][size];
	    int sum=0;
	    
	    for(int i=0;i<size;i++)
	    {
	        for(int j=0;j<size;j++)
	        {
	            arr[i][j]=s.nextInt();
	            if(i==j||(j+i)==size-1||i==0||j==0||i==size-1||j==size-1)
	            {
	                sum=sum+arr[i][j];
	            }
	            
	        }
	        
	    }
	    System.out.print(sum);
	
}
}