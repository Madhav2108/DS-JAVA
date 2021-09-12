mport java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String str1=s.nextLine();
	String str2=s.nextLine();
	char arr1[]=str1.toCharArray();
	char arr2[]=str2.toCharArray();
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	if(arr1.length!=arr2.length)
	{
	    System.out.print("false");
	    return;
	}
	for(int i=0;i<arr1.length;i++)
	{
	  if(arr1[i]!=arr2[i])
	  {
	    System.out.print("false");
	    return;
	  }
	}
	System.out.print("true")
    }
}
