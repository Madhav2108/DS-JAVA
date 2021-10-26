import java.util.*;
public class Main
{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node Createlinklist()
    {

        Node n1= new Node(10);
        Node n2= new Node(20);
        Node n3= new Node(30);
        Node n4= new Node(40);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        
        return n1;
    }
    public static void printlinklist(Node head)
    {
        // System.out.println(head.data);
        //  System.out.println(head.next.data);
        //  System.out.println(head.next.next.data);
        //   System.out.println(head.next.next.next.data);
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void incriment(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            temp.data++;
            temp=temp.next;
        }
    }
	public static void main(String[] args) {
		Node head=Createlinklist();
		incriment(head);
		printlinklist(head);
	}
}
