import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int arr[] =new int[size];
		for(int i=0;i<size;i++)
		{
		    arr[i]=s.nextInt();
		}
		for(int i=0;i<size-1;i++)
		{
		    int min=i;
		    for(int j=i+1;j<size;j++)
		    {
		        if(arr[j]<arr[min])
		        {
		            min=j;
		        }
		    }
		    int temp=arr[i];
		    arr[i]=arr[min];
		    arr[min]=temp;
		}
		for(int i=0;i<size;i++)
		{
		  System.out.print(arr[i]);
		}
	}
}