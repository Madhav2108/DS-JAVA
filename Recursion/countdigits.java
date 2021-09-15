import java.util.*;
public class Main
{
    public static int recursion(int num,int r)
    {
        if(num==0&&r==0)
        {
            return 1;
        }
        else if(num==0){
            return 0;
        }
        else{
        int sum=0;
        sum=sum+1+recursion(num/10,num%10);
        return sum;
        }
        
    }
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int number=s.nextInt();
	    int rem=0;
	    int ans=recursion(number,rem);
	    System.out.print(ans);
	
}
}