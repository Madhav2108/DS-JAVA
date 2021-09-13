import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int row=s.nextInt();
	    int col=s.nextInt();
	    int arr[][]=new int[row][col];
	    int sum[]=new int[row];
	    for(int i=0;i<row;i++)
	    {
	        int sum1=0;
	        for(int j=0;j<col;j++)
	        {
	            arr[i][j]=s.nextInt();
	            sum1=sum1+arr[i][j];
	        }
	        
	        sum[i]=sum1;
	    }
	    for(int i=0;i<row;i++)
	    {
	        System.out.print(sum[i]+" ");
	    }
}
}