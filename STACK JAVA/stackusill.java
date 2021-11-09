import java.util.*;

public class Main
{
    public static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static class stacklinklist{
        
        private static Node head;
        private static int  size;
        public stacklinklist()
        {
            head=null;
            size=0;
        }
        
    public static int size()
    {
        return size;
    }
    public static void push(int element)
    {
       Node currentnode=new Node(element);
       currentnode.next=head;
       head=currentnode;
       size++;
    }
    public static int pop()
    {
        if(head==null)
        {
            System.out.print("stack is empty");
            return -1;
        }
        int ans=head.data;
       head=head.next;
       size--;
       return ans;
    }
    public static int top()
    {
        if(head==null)
        {
            System.out.print("stack is empty");
            return -1;
        }
        return head.data;
    }
    public static boolean isEmpty()
    {
        return size==0;
    }
    }
	public static void main(String[] args) {
		stacklinklist s= new stacklinklist();
		s.push(10);
		System.out.print(s.pop());
	}
}
