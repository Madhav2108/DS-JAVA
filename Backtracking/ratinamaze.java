import java.util.*;
public class Main
{
    public static boolean check(int i,int j,int m,int n,int size,int arr[][])
    {
        if(i==size-1&&j==size-1)
        {
            return true;
        }
        if((i-1>=0)&&(m!=i-1)&&(arr[i-1][j]==1)&&(check(i-1,j,i,j,size,arr)))
        {
            return true;
        }
        else if((j+1<size)&&(n!=j+1)&&(arr[i][j+1]==1)&&(check(i,j+1,i,j,size,arr)))
        {
            return true;
        }
        else if((i+1<size)&&(m!=i+1)&&(arr[i+1][j]==1)&&(check(i+1,j,i,j,size,arr)))
        {
            return true;
        }
        else if((j-1>=0)&&(n!=j-1)&&(arr[i][j-1]==1)&&(check(i,j-1,i,j,size,arr)))
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
    public static void main (String[] args) {
    Scanner s =new Scanner(System.in);
    int size=s.nextInt();
    int arr[][]=new int[size][size];
    for(int i=0;i<size;i++)
    {
        for(int j=0;j<size;j++)
        {
            
            arr[i][j]=s.nextInt();
            if(i==0&&j==0)
            {
                if(arr[i][j]!=1)
                {
                    System.out.println("not allowed 0 at 1 place");
                    return ;
                }
            }
            if(arr[i][j]>1)
            {
                System.out.println("only 0 and 1 allowed");
                j--;
                continue;
            }
        }
    }
    if(check(0,0,0,0,size,arr))
    {
        System.out.print("true");
    }
    else
    {
        System.out.print("false");
    }
    
}
}
















