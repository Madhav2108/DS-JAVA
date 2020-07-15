mport java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,j,k;
		n=sc.nextInt();
		int[] arr=new int[n];
		for(i=0;i<arr.length;i++)
		{
		    arr[i]=sc.nextInt();
		   
		}
	for(i=0;i<arr.length;i++)
	{
	    for(j=i;j<arr.length;j++)
	    {
	        if(arr[j]<arr[i])
	        {
	            k=arr[j];
	            arr[j]=arr[i];
	            arr[i]=k;
	        }
	    }
	}for(i=0;i<arr.length;i++)
	{
	    System.out.print(arr[i]+" ");
	}


        Scanner sc=new Scanner(System.in);
		int n,i;
		n=sc.nextInt();
		int[] arr=new int[n];
		for(i=0;i<arr.length;i++)
		{
		    arr[i]=sc.nextInt();
		   
		}
		Arrays.sort(arr);
		
		  System.out.println(Arrays.toString(arr));    
		
		
	}
}