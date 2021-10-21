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
    public static Node shiftposition (Node head ,int data)
    {
        if(data==0||head==null)
        {
            return head;
        }
        int i=0;
        Node temp=head;
        Node shift=head;
        Node last=head;
        Node set=null;
        while(temp!=null)
        {
            i++;
            temp=temp.next;
        }
        data=i-data;
        i=1;
        while(i!=data)
        {
            shift=shift.next;
            i++;
        }
        head=shift.next;
        set=head;
        shift.next=null;
        while(set.next!=null)
        {
            set=set.next;
        }
        set.next=last;
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
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int numberofcases=s.nextInt();
		while(numberofcases>0)
		{
		    Node head=takeinput();
		    int data=s.nextInt();
		    Node ans=shiftposition(head,data);
		    printnode(ans);
		    numberofcases--;
		}
	}
}
