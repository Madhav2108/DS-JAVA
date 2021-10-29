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
    public static Node insert(Node head,int data,int Position)
    {
        if(head==null && Position>0)
        {
            System.out.println("out of length Position");
            return head;
        }
        if(Position==0)
        {
            Node currentNode=new Node(data);
            currentNode.next=head;
            return currentNode;
        }
        else{
        Node temp=insert(head.next,data,Position-1);
        head.next=temp;
        return head;
        }
    }
	public static void main(String[] args) {
		Node head=takeinput();
		Scanner s=new Scanner(System.in);
		int data=s.nextInt();
		int Position=s.nextInt();
		head=insert(head,data,Position);
		printnode(head);
	}
}
