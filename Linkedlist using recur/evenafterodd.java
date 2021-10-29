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
    public static Node convert(Node head)
    {
        if(head==null||head.next==null)
        {
            return head;
        }
        Node temp=head;
        Node odd=null;
        Node even=null;
        Node conect=null;
        if(temp.data%2!=0)
        {
            odd=temp;
            temp=temp.next;
            head=odd;
        }
        else{
            even=temp;
            temp=temp.next;
            conect=even;
        }
        while(temp!=null)
        {
            if(temp.data%2==0)
            {
                if(even==null)
                {
                    even=temp;
                    temp=temp.next;
                    conect=even;
                }
                else{
                    even.next=temp;
                    even=even.next;
                    temp=temp.next;
                }
                
            }
            else
            {
                if(odd==null)
                {
                    odd=temp;
                    temp=temp.next;
                    head=odd;
                }
                else{
                    odd.next=temp;
                    odd=odd.next;
                    temp=temp.next;
                }
            }
        }
        odd.next=conect;
        even.next=null;
        
        return head;
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
		    Node ans=convert(head);
		    printnode(ans);
		    count--;
		}
	}
}
