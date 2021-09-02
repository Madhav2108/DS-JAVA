import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int testcase= s.nextInt();
		while(testcase>0)
		{
		    int size=s.nextInt();
		    int arr[]= new int[size];
		    for(int i=0;i<size;i++)
		    {
		        arr[i]=s.nextInt();
		    }
		    int temp=0;
		    for(int i=0;i<size-1;i+=2)
		    {
		        temp=arr[i];
		        arr[i]=arr[i+1];
		        arr[i+1]=temp;
		    }
		    for(int i=0;i<size;i++)
		    {
		        System.out.print(arr[i]);
		    }
		    
		    testcase--;
		}
		
	}
}