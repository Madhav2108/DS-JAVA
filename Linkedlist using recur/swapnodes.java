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
    public static Node swap(Node head,int m,int n)
    {
        Node p1=null;
        Node c1=null;
        Node p2=null;
        Node c2=null;
        Node frw=null;
        if(head==null||head.next==null)
        {
            return head;
        }
        if(m==n)
        {
            return head;
        }
        if(m==0)
        {
            Node temp=head;
            frw=temp.next;
            int i=0;
            while(temp!=null&&i<n)
            {
                if(i+1==n)
                {
                    p2=temp;
                    c1=temp.next;
                    p2.next=head;
                    head.next=c1.next;
                    c1.next=frw;
                    head=c1;
                }
                temp=temp.next;
                i++;
            }
        }
        else if(n-m==1)
        {
            Node temp=head;
            int i=0;
            while(temp!=null&&i<m)
            {
                if(i+1==m)
                {
                    p1=temp;
                    c1=temp.next;
                    c2=temp.next.next;
                    c1.next=c2.next;
                    c2.next=c1;
                    p1.next=c2;
                }
                temp=temp.next;
                i++;
                
            }
        }
        else{
            Node temp=head;
            int i=0;
            while(temp!=null&&i<n)
            {
                if(i+1==m)
                {
                   p1=temp;
                   c1=temp.next;
                }
                if(i+1==n)
                {
                    p2=temp;
                }
                temp=temp.next;
                i++;
            }
            if(i==n)
            {
                p1.next=temp;
                p2.next=c1;
                frw=temp.next;
                temp.next=c1.next;
                c1.next=frw;
            }
            else{
                System.out.println("Index out of ll");
                return head;
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
		    Node ans=swap(head,m,n);
		    printnode(ans);
		    count--;
		}
	}
}
