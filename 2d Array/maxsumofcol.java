import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int row=s.nextInt();
	    int col=s.nextInt();
	    int arr[][]=new int[row][col];
	    int maxsum=0;
	    int maxcol=0;
	    for(int i=0;i<row;i++)
	    {
	        for(int j=0;j<col;j++)
	        {
	            arr[i][j]=s.nextInt();
	        }
	        
	    }
	    for(int i=0;i<col;i++)
	    {
	        int sum=0;
	        for(int j=0;j<row;j++)
	        {
	            sum=sum+arr[j][i];
	        }
	        if(sum>maxsum)
	        {
	            maxsum=sum;
	            maxcol=i;
	        }
	        
	    }
	    System.out.print("coloum "+maxcol+" "+maxsum);
}
}