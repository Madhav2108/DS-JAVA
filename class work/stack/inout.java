import java.util.Scanner;  
class inout   
{  
    int top;   
    int m = 10;  
    int[] arr = new int[m];  
      
      
    boolean isEmpty()  
    {  
        return (top < 0);  
    }  
    Stack()  
    {  
        top = -1;  
    }  
    boolean push (Scanner sc)  
    {  
        if(top == m-1)  
        {  
            System.out.println("Overflow");  
            return false;  
        }  
        else   
        {  
            System.out.println("Enter data");  
            int val = sc.nextInt();  
            top++;  
            arr[top]=val;  
            System.out.println("Item added");  
            return true;  
        }  
    }  
    boolean pop ()  
    {  
        if (top == -1)  
        {  
            System.out.println("Underflow");  
            return false;  
        }  
        else   
        {  
            top --;   
            System.out.println("Item revomed");  
            return true;  
        }  
    }  
    void display ()  
    {  
        System.out.println("Printing stack data");  
        for(int i = top; i>=0;i--)  
        {  
            System.out.println(arr[i]);  
        }  
    }  
}  
public class Stack_Operations {  
public static void main(String[] args) {  
    int choice=0;  
    Scanner sc = new Scanner(System.in);  
    Stack s = new Stack();  
    while(choice != 4)  
    {  
        System.out.println("\nChose one\n");  
        System.out.println("\n1.Push\n2.Pop\n3.Show\n4.Exit");  
        System.out.println("\n Enter your option\n");        
        choice = sc.nextInt();  
        switch(choice)  
        {  
            case 1:  
            {   
                s.push(sc);  
                break;  
            }  
            case 2:  
            {  
                s.pop();  
                break;  
            }  
            case 3:  
            {  
                s.display();  
                break;  
            }  
            case 4:   
            {  
                System.out.println("thankyou ");  
                System.exit(0);  
                break;   
            }  
            default:  
            {  
                System.out.println("Enter valid option");  
            }   
        };  
    }  
}  
}  