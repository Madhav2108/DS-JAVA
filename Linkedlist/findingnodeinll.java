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
    public static int searchposition (Node head ,int data)
    {
        int i=0;
        Node temp=head;
        while(temp!=null)
        {
            if(temp.data==data)
            {
                return i;
            }
            i++;
            temp=temp.next;
        }
        return -1;
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int numberofcases=s.nextInt();
		while(numberofcases>0)
		{
		    Node head=takeinput();
		    int data=s.nextInt();
		    int ans=searchposition(head,data);
		    System.out.println(ans);
		    numberofcases--;
		}
	}
}
