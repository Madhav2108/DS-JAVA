import java.util.*;
public class Main
{
    public static class Queue{
        private int data[];
        private int front;
        private int rear;
        private int size;
        
        public static Queue()
        {
            data=new int[5];
            front=-1;
            rear=-1;
            
        }
        public static Queue(int capacity)
        {
            data=new int[capacity];
            front=-1;
            rear=-1;
            
        }
        public static int size()
        {
            return size;
        }
        public static boolean isEmpty(){
            return size==0;
        }
        public static void enqueue(int ele)
        {
            if(size==0)
            {
                front=0;
                rear=0;
                data[front]=ele;
            }
            else
            {
                rear++;
                if(rear==data.length)
                {
                    rear=0;
                }
                data[rear]=ele;
            }
            size++;
        }
        public static int front()
        {
            if(size==0)
            {
                System.out.print("queue is empty");
                return-1;
            }
            return data[frount];
        }
        public static int dequeue()
        {
            size--;
            if(size==0)
            {
                int temp=data[front];
                front=-1;
                rear=-1;
                return temp;
            }
            front++; 
            if(front==data.length)
                {
                    rear=0;
                }
            return(data[front-1]);
        }
    }
	public static void main(String[] args) {
		
	}
}
