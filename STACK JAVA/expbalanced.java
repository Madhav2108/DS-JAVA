import java.util.Stack;
import java.util.*;

public class Main
{
    // public static class stackarray{
        
    //     private static int data[];
    //     private static int topindex;
    //     public stackarray(){
    //         data= new int[10];
    //         topindex=-1;
    //     }
        
    // public static int size()
    // {
    //     return topindex+1;
    // }
    // public static void push(int element)
    // {
    //     if(topindex==data.length-1)
    //     {
    //       doublearray();
    //     }
    //     topindex++;
    //     data[topindex]=element;
    // }
    // private static void doublearray()
    // {
    //     int temp[]=data;
    //     data=new  int[2*temp.length];
    //     for(int i=0;i<temp.length;i++)
    //     {
    //         data[i]=temp[i];
    //     }
    // }
    // public static int pop()
    // {
    //     int temp= data[topindex];
    //     topindex--;
    //     return temp;
    // }
    // public static int top()
    // {
    //     if(topindex==-1)
    //     {
    //         System.out.print("stack is empty");
    //         return -1;
    //     }
    //     return data[topindex];
    // }
    // public static boolean isEmpty()
    // {
    //     return topindex==-1;
    // }
    // }
    public static boolean isbalenced(String exp)
    {
        Stack<Character> stack =new Stack<>();
        for(int i=0;i<exp.length();i++)
        {
            if(exp.charAt(i)=='('||exp.charAt(i)=='['||exp.charAt(i)=='{')
            {
                stack.push(exp.charAt(i));
            }
            else if (exp.charAt(i)==')'||exp.charAt(i)==']'||exp.charAt(i)=='}')
            {
                if(stack.isEmpty())
                {
                    return false;
                }
                else
                {
                    char top=stack.pop();
                    if((exp.charAt(i)==')'&&top=='('||exp.charAt(i)==']'&&top=='['||exp.charAt(i)=='}'&&top=='{')
                    {
                        continue;
                    }
                    else
                    {
                        return false;
                    }
                }
            }
        }
        
        return stack.isEmpty();
        
    }
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		String exp=new String(s.nextLine());
		if(isbalenced(exp))
		{
		    System.out.print("true");
		}
		else{
		     System.out.print("False");
		}
	}
}
