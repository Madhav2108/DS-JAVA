import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int row=s.nextInt();
	    int col=s.nextInt();

	    int arr[][]=new int[row][col];
	    int sum=0;
	    
	    for(int i=0;i<row;i++)
	    {
	        for(int j=0;j<col;j++)
	        {
	            arr[i][j]=s.nextInt();
	        }
	        
	    }
	    for(int i=0;i<col;i++)
	    {
	        if(i%2==0)
	        {
	        for(int j=0;j<row;j++)
	        {
	            System.out.print(arr[j][i]+" ");
	        }
	        }
	        else
	        {
	            for(int j=row-1;j>=0;j--)
	        {
	            System.out.print(arr[j][i]+" ");
	        }
	        }
	        
	    }
	
}
}