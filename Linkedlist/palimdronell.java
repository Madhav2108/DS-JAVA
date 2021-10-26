import java.util.*;
public class Main
{
    public static class Nord{
        int data;
        Nord next;
        Nord(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Nord takeinput(){
        Scanner s= new Scanner(System.in);
        int data=s.nextInt();
        Nord head=null;
        Nord tail=null;
        while(data!=-1)
        {
            Nord currentnord=new Nord(data);
            if(head==null)
            {
                head=currentnord;
                tail=currentnord;
            }
            else{
                tail.next=currentnord;
                tail=tail.next;
            } 
            data=s.nextInt();
        }
        return head;
    }
    public static Nord reverce(Nord head)
    {
        Nord cur=head;
        Nord frw=null;
        Nord pre=null;
        while(cur!=null)
        {
            frw=cur.next;
            cur.next=pre;
            pre=cur;
            cur=frw;
        }
        return pre;
    }
    public static void printNode(Nord head)
    {
        Nord temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static boolean cheackpalimdrone(Nord head)
    {
        Nord temp=head;
        int i=0;
        while(temp!=null)
        {
            temp=temp.next;
            i++;
        }
        if(i%2==0)
        {
            i=i/2;
        }
        else
        {
            i++;
            i=i/2;
        }
        Nord temp1=head;
        int j=0;
        while(j<i-1)
        {
            temp1=temp1.next;
            j++;
        }
        Nord head2=temp1.next;
        temp1.next=null;
        head2=reverce(head2);
        while(head2!=null)
        {
            if(head.data==head2.data)
            {
                head=head.next;
                head2=head2.next;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int count=s.nextInt();
		while(count>0)
		{
		    Nord head=takeinput();
		    if(cheackpalimdrone(head))
		    {
		        System.out.print("True");
		    }
		    else{
		        System.out.print("False");
		    }
		    count--;
		}
	}
}
