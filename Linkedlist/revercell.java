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
    public static void printNode(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static Node reverceprint(Node head)
    {
        Node cur=head;
        Node frw=null;
        Node pre=null;
        
        while(cur!=null)
        {
            frw=cur.next;
            cur.next=pre;
            pre=cur;
            cur=frw;
        }
        return pre;
    }
	public static void main(String[] args) {
	    Scanner s= new Scanner(System.in);
	    int count=s.nextInt();
	    while(count>0)
	    {
	        Node head=takeinput();
	       head=reverceprint(head);
	       printNode(head);
	        count--;
	    }
		
	}
}
