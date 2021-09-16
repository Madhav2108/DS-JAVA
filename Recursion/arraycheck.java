import java.util.*;
import java.lang.Math;
public class Main
{
    public static int recursion(int[] ar,int c,int s)
    {
        if(ar[s]==c)
        return s;
        if(ar[s]!=c&&s==0)
        {
            System.out.print("not found setting index to ");
            return 0;
        }
        return recursion(ar,c,s-1);
  
    }
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int size=s.nextInt();
	    int arr[]=new int[size];
	    for(int i=0;i<size;i++)
	    {
	        arr[i]=s.nextInt();
	    }
	    int check=s.nextInt();
	    int ans =recursion(arr,check,size-1);
	    System.out.print(ans);
}
}