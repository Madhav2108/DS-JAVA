import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
		    arr[i]=s.nextInt();
		}
		for(int i=1;i<size;i++)
		{
		    int saved=arr[i];
		    int j=i-1;
		    while(j>=0&&arr[j]>saved)
		    {
		        arr[j+1]=arr[j];
		        j--;
		    }
		    arr[j+1]=saved;
		}
		for(int i=0;i<size;i++)
		{
		    System.out.print(arr[i]);
		}
		
	}
}
