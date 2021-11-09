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
    public static void reverce(Stack<Integer> stack,Stack<Integer> helper)
    {
        if(stack.size()<=1)
        {
            return;
        }
       
        int temp=stack.pop();
        reverce(stack,helper);
        while(!stack.isEmpty())
        {
            helper.push(stack.pop())
        }
        stack.push(temp);
        while(!helper.isEmpty())
        {
            stack.push(helper.pop())
        }
    }
	public static void main(String[] args) {
		Stack<Integer> stack=new stack<>();
		Stack<Integer> helper=new stack<>();
		Scanner s=new Scanner(System.in);
		int data=s.nextInt();
		while(data!=-1)
		{
		    stack.push(data);
		    data=s.nextInt();
		}
		reverce(stack,helper);
		while(!stack.isEmpty())
		{
		    System.out.print(stack.pop());
		}
		}
	}
}
