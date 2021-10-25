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
        Scanner s=new Scanner(System.in);
        int data=s.nextInt();
        
        Node head=null;
        Node tail=null;
        while(data!=-1)
        {
            Node currentnode=new Node(data);
            if(head==null)
            {
                head=currentnode;
                tail=currentnode;
            }
            else{
                tail.next=currentnode;
                tail=tail.next;
            }
            data=s.nextInt();
        }
        
        return head;
    }
    public static void printnode(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static Node Eliminatedup(Node head)
    {
        Node temp=head;
        while(temp.next!=null)
        {
            if(temp.data==temp.next.data)
            {
                temp.next=temp.next.next;
            }
            else{
                
                temp=temp.next;
            }
        }
        return head;
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int numberofcases=s.nextInt();
		while(numberofcases>0)
		{
		    Node head=takeinput();
		    Node ans=Eliminatedup(head);
		    printnode(ans);
		    numberofcases--;
		}
	}
}
