import java.util.*;
import java.lang.*;
import java.io.*;

class array rotation{
	public static void main (String[] args) {
		int t;
		Scanner sc= new Scanner(System.in);
		t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int new=sc.nextInt();
		    int d=sc.nextInt();
		    int [] arr= new int [new];
		    for(i=0;i<new;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    for(i=d;i<new;i++)
		    {

		        System.out.print(arr[i]+" ");
		    }
		    for(i=0;i<=d;i++)
		    {
		        System.out.print(arr[i]+" ");
		    }
		}
	}
}