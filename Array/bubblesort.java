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
		int temp;
		for(int i=0;i<size-1;i++)
		{
		    for(int j=0;j<size-i-1;j++)
		    {
		        if(arr[j]>arr[j+1])
		        {
		            temp=arr[j];
		            arr[j]=arr[j+1];
		            arr[j+1]=temp;
		        }
		    }
		}
		for(int i=0;i<size;i++)
		{
		    System.out.print(arr[i]);
		}
	}
}
