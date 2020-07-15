/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		int t;
		Scanner sc= new Scanner(System.in);
		t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int n=sc.nextInt();
		    int d=sc.nextInt();
		    int [] arr= new int [n];
		    for(i=0;i<n;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    for(i=d;i<n;i++)
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