import java.util.*;
public class Main
{
    public static int recursion(int[] ar,int c,int s,int ind)
    {
        
        if(ar[s]==c)
        {
            if(s>=ind)
            {
                ind=s;
            }
            if(s==ar.length-1)
            {
                return ind;
            }
            ind=recursion(ar,c,s+1,ind);
        }
        else if(ar[s]!=c&&s==ar.length-1)
        {
            return ind;
        }
        else 
        ind=recursion(ar,c,s+1,ind);
        return ind;
  
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
	    int ans =recursion(arr,check,0,0);
	    System.out.print(ans);
}
}