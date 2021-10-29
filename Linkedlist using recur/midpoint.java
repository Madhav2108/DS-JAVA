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
    public static void Midpoint(Node head)
    {
        if(head==null||head.next==null)
        {
            return;
        }
        
        Node slow=head;
        Node fast=head;
        while(fast.next!=null&&fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.data);
        
    }
	public static void main(String[] args) {
		Node head=takeinput();
		Midpoint(head);
	}
}
