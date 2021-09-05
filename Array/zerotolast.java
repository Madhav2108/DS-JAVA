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
	    int i=0;
	    int last =1;
	    int temp;
	    while(last<size)
	    {
	        if(arr[i]!=0)
	        {
	            i++;
	            last++;
	        }
	        else if(arr[last]==0)
	        {
	            last++;
	        }
	        else{
	            temp=arr[last];
	            arr[last]=arr[i];
	            arr[i]=temp;
	            i++;
	            last++;
	        }
	    }
	    for( i=0;i<size;i++)
	    {
	        System.out.print(arr[i]);
	    }
		
	}
}
