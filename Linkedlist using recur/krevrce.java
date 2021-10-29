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
    public static Node takeinput()
    {
        Scanner s=new Scanner(System.in);
        int data=s.nextInt();
        Node head=null;
        Node tail=null;
        while(data!=-1)
        {
            Node currentNode= new Node(data);
            if(head==null)
            {
                head=currentNode;
                tail=currentNode;
            }
            else
            {
                tail.next=currentNode;
                tail=tail.next;
            }
            data=s.nextInt();
        }
        return head;
    }
    public static Node reverceR(Node head)
    {
        if(head==null||head.next==null)
        {
            return head;
        }
        Node head1=reverceR(head.next);
        head.next.next=head;
        head.next=null;
        return head1;
        
    }
    public static Node krev(Node head,int m)
    {
         if(head==null||head.next==null)
        {
            return head;
        }
       Node temp=head;
       int i=1;
       Node head2=null;
       while(temp!=null&&i<=m)
       {
           if(i==m)
           {
               head2=temp.next;
               temp.next=null;
               break;
           }
           temp=temp.next;
           i++;
       }
       if(temp!=null)
       {
        head2=krev(head2,m);
       }
       Node newhead=reverceR(head);
       head.next=head2;
       
       return newhead;
    }
    public static void printnode(Node head)
    {
        if(head==null)
        {
            return ;
        }
        System.out.print(head.data+" ");
        printnode(head.next);
    }
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int count=s.nextInt();
		while(count>0)
		{
		    Node head=takeinput();
		    int m=s.nextInt();
		    Node ans=krev(head,m);
		    printnode(ans);
		    count--;
		}
	}
}
