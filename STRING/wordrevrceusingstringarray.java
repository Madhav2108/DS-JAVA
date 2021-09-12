import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String str=s.nextLine();
	String arr[]=str.split(" ");
	for(int i=0;i<arr.length;i++)
	{
	    int j=arr.length-1-i;
	    if(i<=j)
	    {
	    String temp=arr[i];
	    arr[i]=arr[j];
	    arr[j]=temp;
	    }
	}
	for(int i=0;i<arr.length;i++)
	{
	System.out.print(arr[i]+" ");
	 }
	}
