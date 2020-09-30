import java.util.*;
import java.lang.*;
import java.io.*;

class Rotation {
	public static void main (String[] args) {
		int t;
		Scanner s= new Scanner(System.in);
		t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int p=s.nextInt();
		    int q=s.nextInt();
		    int [] arr= new int [n];
		    for(i=0;i<n;i++)
		    {
		        arr[i]=s.nextInt();
		    }
		    for(i=q;i<p;i++)
		    {
		        System.out.print(arr[i]+" ");
		    }
		    for(i=0;i<=q;i++)
		    {
		        System.out.print(arr[i]+" ");
		    }
		}
	}
}