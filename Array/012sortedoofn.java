import java.util.*
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int size=s.nextInt();
	    int arr[]= new int[size];
	    for(int i=0;i<size;i++)
	    {
	        arr[i]=s.nextInt();
	    }
	    int i=0;
	    int mid=0;
        int size=arr.length;
	    int last=size-1;
	    int temp;
	    while(mid<=last)
	    {
	       if(i<=last){
               
               if(arr[i]==0)
            {
                i++;
                mid++;
            }
	            else if(arr[last]==0){
	            temp=arr[i];
	            arr[i]=arr[last];
	            arr[last]=temp;
	            i++;
	            mid++;
	        }
	            else
	        {
	            last--;
	        }
               if(i==last)
               {
                   last=size-1;
                   i=size;
                }
           }
            else
            {
            if(arr[last]==1)
            {
                temp=arr[mid];
	            arr[mid]=arr[last];
	            arr[last]=temp;
	            mid++;
            }
                else
                {
                last--;    
                }
            }
	    }
	    for(int i=0;i<size;i++)
	    {
	        System.out.print(arr[i]);
	    }
		
	}
}
