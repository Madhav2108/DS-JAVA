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
		int size1=s.nextInt();
		int arr1[]=new int[size1];
		for(int i=0;i<size1;i++)
		{
		    arr1[i]=s.nextInt();
		}
// 		----------------first approch----------------
		for (int j=0;j<size;j++)
		{
		    for (int i=0;i<size1;i++)
		    {
		       if (arr[j]==arr1[i])
		       {
		           arr1[i]=Integer.MIN_VALUE;
		           System.out.print(arr[j]);
		           break;
		       }
		    }
		}

	}
}