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
    public static Node merge(Node head,Node head1)
    {
        if(head==null)
        {
            return head1;
        }
        if(head1==null)
        {
            return head;
        }
        Node temp1=head;
        Node temp2=head1;
        Node frw=null;
        Node pre=temp1;
        if(temp1.data<temp2.data)
            {
                head=temp1;
               pre=temp1;
               temp1=temp1.next;
            }
            else
            {
               head=temp2;
              frw=temp2.next;
              temp2.next=temp1;
              temp2=frw;
            }
        while(temp1!=null&&temp2!=null)
        {
            if(temp1.data<temp2.data)
            {
               pre=temp1;
               temp1=temp1.next;
            }
            else
            {
                pre.next=temp2;
              frw=temp2.next;
              temp2.next=temp1;
              temp2=frw;
            }
        }
        if(temp1==null)
        {
            pre.next=temp2;
        }
        return head;
    }
	public static void main(String[] args) {
		Node head=takeinput();
		Node head1=takeinput();
		Node ans=merge(head,head1);
		printnode(ans);
	}
}
