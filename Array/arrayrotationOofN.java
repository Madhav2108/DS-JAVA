import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int size=s.nextInt();
	    int arr[]= new int[size];
	    for(int i=0;i<size;i++)
	    {
	        arr[i]=s.nextInt();
	    }
	    int rot=s.nextInt();
	    int j=size-1;
	    int key=0;
	    while(rot>0)
	    {
	        if(j==size-1)
	        {
	            key=arr[j];
	        }
	        if(j>0)
	        {
	            arr[j]=arr[j-1];
	            j--;
	        }
	        if(j==0)
	        {
	            arr[j]=key;
	            j=size-1;
	            rot--;
	        }
	    }
	    
	    for(int i=0;i<size;i++)
	    {
	        System.out.print(arr[i]);
	    }
		
	}
}