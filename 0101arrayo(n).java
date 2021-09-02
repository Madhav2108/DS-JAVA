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
		int last=size-1;
		int temp;
		for(int i=0;i<size;i++)
		{
		   if(arr[i]==1)
		   {
		       if(arr[last]==0)
		       {
		           temp=arr[i];
		           arr[i]=arr[last];
		           arr[last]=temp;
		           last--;
		       }
		       else{
		           last--;
		       }
		   }
		   if(i>=last)
		   {
		       break;
		   }
		}
		for(int i=0;i<size;i++)
		{
		    System.out.print(arr[i]);
		}
	}
}