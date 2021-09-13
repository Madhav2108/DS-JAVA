import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int row=s.nextInt();
	    int col=s.nextInt();
	    int arr[][]=new int[row][col];
	    int maxsumcol=0;
	    int maxsumrow=0;
	    int maxrow=0;
	    int maxcol=0;
	    for(int i=0;i<row;i++)
	    {
	        int sum=0;
	        for(int j=0;j<col;j++)
	        {
	            arr[i][j]=s.nextInt();
	            sum=sum+arr[i][j];
	        }
	        if(sum>maxsumrow)
	        {
	            maxsumrow=sum;
	            maxrow=i;
	        }
	        
	        
	    }
	    for(int i=0;i<col;i++)
	    {
	        int sum=0;
	        for(int j=0;j<row;j++)
	        {
	            sum=sum+arr[j][i];
	        }
	        if(sum>maxsumcol)
	        {
	            maxsumcol=sum;
	            maxcol=i;
	        }
	        
	    }
	    if(maxsumrow>maxsumcol)
	    System.out.print("coloum "+maxcol+" "+maxsumcol);
	    else{
	        System.out.print("row "+maxrow+" "+maxsumrow);
	    }
}
}
