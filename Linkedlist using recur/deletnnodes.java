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
    public static Node delete(Node head,int m,int n)
    {
        if(head==null)
        {
            return head;
        }
        if(n==0)
        {
            return head;
        }
        if(m==0)
        {
            return null;
        }
        int c1=m;
        int c2=n;
        Node conecter=head;;
        Node temp=head;
        while(temp!=null)
        {
            if(c1>0)
            {
                conecter=temp;
                temp=temp.next;
                
                c1--;
            }
            else if(c2>0)
            {
                if(temp.next==null)
                {
                    conecter.next=null;
                }
                temp=temp.next;
                c2--;
            }
            else{
                conecter.next=temp;
                c1=m;
                c2=n;
            }
        }
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
		    int m=s.nextInt();
		    int n=s.nextInt();
		    Node ans=delete(head,m,n);
		    printnode(ans);
		    count--;
		}
	}
}
