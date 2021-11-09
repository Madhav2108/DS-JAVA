import java.util.*;

public class Main
{
    public static class stack{
        
        private int data[];
        private int topindex;
        public stack(){
            data= new int [10];
            topindex=-1;
        }
        
    public static int size()
    {
        return topindex+1;
    }
    public static void push(int element)
    {
        // if(topindex==data.length-1)
        // {
            
        // }
        topindex++;
        data[topindex]=element;
    }
    public static int pop()
    {
        int temp= data[topindex];
        topindex--;
        return temp;
    }
    public static int top()
    {
        // if(topindex==-1)
        // {
        //     throw 
        // }
        return data[topindex];
    }
    public static boolean isEmpty()
    {
        return topindex==-1;
    }
}
	public static void main(String[] args) {
		stack s= new stack;
		s.push(10);
	}
}
