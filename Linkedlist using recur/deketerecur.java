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
    public static Node takeinput()
    {
        Scanner s= new Scanner(System.in);
        int data=s.nextInt();
        Node head=null;
        Node tail=null;
        while(data!=-1)
        {
            Node currentNode=new Node(data);
            if(head==null)
            {
                head=currentNode;
                tail=currentNode;
            }
            else{
                tail.next=currentNode;
                tail=tail.next;
            }
            
            data=s.nextInt();
        }
        return head;
    }
    public static void printnode(Node head)
    {
        if(head==null)
        {
            return;
        }
        
        System.out.print(head.data+" ");
        printnode(head.next);
        
    }
    public static Node delete(Node head,int Position)
    {
        if(head==null && Position>0)
        {
            System.out.println("out of length Position");
            return head;
        }
        if(Position==0)
        {
            return head.next;
        }
        else{
        head.next=delete(head.next,Position-1);
        
        return head;
        }
    }
	public static void main(String[] args) {
		Node head=takeinput();
		Scanner s=new Scanner(System.in);
		int Position=s.nextInt();
		head=delete(head,Position);
		printnode(head);
	}
}
