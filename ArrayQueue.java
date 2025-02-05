import java.util.*;
public class ArrayQueue{	
protected int capacity;
protected int[] queue;
protected int front=-1;
protected int rear= -1;
public ArrayQueue(int cap) {
capacity = cap;
queue = new int[capacity];
}
public int size()
{
    return (rear+1);
}
public void enQueue() 
{
//TYPE YOUR CODE HERE
}
public int deQueue() 
{
//TYPE YOUR CODE HERE
}
public boolean isFull()
{
//TYPE YOUR CODE HERE
}
public boolean isEmpty()
{
//TYPE YOUR CODE HERE
}
public void display()
{
    if(isEmpty())
    System.out.println("Queue is Underflow. No elements to display in Empty Queue");
    else
    {
    System.out.println("Queue Elements");
    for(int i=front+1;i<=rear;i++)
    System.out.print(queue[i]+"\t");
    }
}
public static void main(String[] args)
{
    ArrayQueue q=new ArrayQueue(5);
    Scanner sc=new Scanner(System.in);
    int data,ch;
    do
    {
    System.out.println("1.EnQueue");
    System.out.println("2.DeQueue");
    System.out.println("3.Display Queue");
    System.out.println("4.Exit");
    System.out.println("Enter your choice:"); 
    ch=sc.nextInt();
    switch(ch)
    {
        case 1: 
            System.out.println("Enter the element to insert:");
            data=sc.nextInt();
            q.enQueue(data);
            break;
        case 2:            
            data=q.deQueue();
            if(data!=-1)
            System.out.println("Deleted Element:"+data);
            break;
            case 3:
                q.display();
                break;
              } }while(ch<4);
}
}
