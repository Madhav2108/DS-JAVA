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
	    int lastlimitcol=col-1;
	    int lastlimitrow=row-1;
	    int startlimitcol=0;
	    int startlimitrow=0;
	    int i=startlimitrow;
	    int j=startlimitcol;
	    int flag=0;
	    int totalnumber=row*col;
	    while(totalnumber>0)
	    {
	        
	        if(j!=lastlimitcol&flag==0)
	        {
	            System.out.print(arr[i][j]+" ");
	            totalnumber--;
	            j++;
	        }
	        else if(i!=lastlimitrow&flag==0)
	        {
	           System.out.print(arr[i][j]+" ");
	           totalnumber--;
	            i++; 
	        }
	        if(i==lastlimitrow&&j==lastlimitcol)
	        {
	            System.out.print(arr[i][j]+" ");
	            totalnumber--;
	            flag=1;
	        }
	        if(j!=startlimitcol&flag==1)
	        {
	            
	            j--;
	            System.out.print(arr[i][j]+" ");
	            totalnumber--;
	            
	        }
	        else if(i!=startlimitrow&flag==1)
	        {
	            i--;
	            if(i!=startlimitrow)
	            {
	           System.out.print(arr[i][j]+" ");
	           totalnumber--;
	            }
	        }
	        
	        if(i==startlimitrow&&j==startlimitcol&&flag==1&&(i+1)!=lastlimitrow&&(j+1)!=lastlimitcol)
	        {
	            startlimitrow++;
	            startlimitcol++;
	            lastlimitrow--;
	            lastlimitcol--;
	            flag=0;
	            i=startlimitrow;
	            j=startlimitcol;
	        }
	        
	        
	       
	    }
	
}
}