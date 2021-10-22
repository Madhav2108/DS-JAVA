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
    public static int length(Node head)
    {
        Node temp=head;
        int i=0;
        while(temp!=null)
        {
            i++;
            temp=temp.next;
        }
        return i;
    }
    public static void printithnode(Node head,int i)
    {
        int position=0;
        Node temp=head;
        while(temp!=null&&position<i-1)
        {
            temp=temp.next;
            position++;
        }
        if(temp!=null)
        {
            System.out.println(temp.data);
        }
        else{
            System.out.println("linklist does not contain that node sorry :(");
        }
        
    }
    public static Node takeinput()
    {
        Scanner s=new Scanner(System.in);
        int data=s.nextInt();
        Node head=null,tail=null;
        while(data!=-1)
        {
            Node currentNode=new Node(data);
            if(head==null)
            {
                // making head pointer
                head=currentNode;
                tail=currentNode;
            }
            else{
            //     Node tail=head;
            //     while(tail.next!=null)
            //     {
            //         tail=tail.next;
            //     }
                tail.next=currentNode;
                tail=tail.next;
            }
            data=s.nextInt();
        }
        
        return head;
    }
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
		Node head=Createlinklist();
		incriment(head);
		printlinklist(head);
		System.out.println("length->"+length(head));
		int ithnode=s.nextInt();
		printithnode(head,ithnode);
		Node head1=takeinput();
		printlinklist(head1);
	}
}
