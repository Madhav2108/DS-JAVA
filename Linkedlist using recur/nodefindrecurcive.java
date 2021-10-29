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
    public static int check(Node head,int eliment)
    {
        if(head==null)
        {
            return -1;
        }
        if(head.data==eliment)
        {
            return 0;
        }
        int ans=check(head.next,eliment);
        if(ans==-1)
        {
            return -1;
        }
        return ans+1;
    }
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int count=s.nextInt();
		while(count>0)
		{
		    Node head=takeinput();
		    int eliment=s.nextInt();
		    int ans=check(head,eliment);
		    System.out.println(ans);
		    count--;
		}
	}
}
