import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int arr1[]= new int[size];
		for(int i=0;i<size;i++)
		{
		    arr1[i]=s.nextInt();
		}
		int size1=s.nextInt();
		int arr2[]=new int[size1];
		for(int i=0;i<size1;i++)
		{
		    arr2[i]=s.nextInt();
		}
		int n1=arr1.length;
        int n2=arr2.length;
        int newarr1[]=new int[10];
        int newarr2[]=new int[10];
		for(int i=0;i<n1;i++)
		{
		newarr1[arr1[i]]++;
		}
		for(int i=0;i<n2;i++)
		{
		newarr2[arr2[i]]++;
		}
		int count;
       for(int i=0;i<newarr1.length;i++)
        {
        if(newarr1[i]>=1 && newarr2[i]>=1)
        count=Math.min(newarr1[i],newarr2[i]);
        if(count>1)
        {
        System.out.print(i+" ");
        }
// // 		----------------first approch----------------
// 		for (int j=0;j<size;j++)
// 		{
// 		    for (int i=0;i<size1;i++)
// 		    {
// 		       if (arr[j]==arr1[i])
// 		       {
// 		           arr1[i]=Integer.MIN_VALUE;
// 		           System.out.print(arr[j]);
// 		           break;
// 		       }
// 		    }
// 		}

	}
}
