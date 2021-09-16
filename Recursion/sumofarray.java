import java.util.*;
import java.lang.Math;
public class Main
{
    public static int recursion(int[] ar,int num)
    {
        if(num==0)
        {
            return 0;
        }
        return ar[num-1]+recursion(ar,num-1);
  
    }
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int size=s.nextInt();
	    int arr[]=new int[size];
	    for(int i=0;i<size;i++)
	    {
	        arr[i]=s.nextInt();
	    }
	    long ans=recursion(arr,size);
	    System.out.print(ans);
	
}
}