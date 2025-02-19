import java.util.*;
public class ArrayDeQueue{
protected int capacity;
protected int[] queue;
protected int front=-1;
protected int rear= -1;
public ArrayDeQueue(int cap) {
capacity = cap;
queue = new int[capacity];
}
public int size()
{
    return (rear+1);
}
public void enQueue(int data)
{
if (isFull())
System.out.println("Queue is Overflow. Not possible to insert in Full Queue");
else
{
queue[++rear] = data;
//System.out.println("Element is inserted");
}
}
public boolean isFull()
{
    return (size()==capacity);
}

public int deQueue()
{
// TYPE YOUR CODE
}

public boolean isEmpty()
{
    // TYPE YOUR CODE
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
    System.out.print("\n");
    }
}
public static void main(String[] args)
{
     int data,n;
    char ch;
   
    Scanner sc=new Scanner(System.in);
     System.out.println("DeQueue Using Array");
    System.out.println("Enter the number of elements to be inserted:");
//TYPE YOUR CODE HERE
     System.out.println("Queue Using Array created with size "+n);
    q.display();
    System.out.println("Do you want to Dequeue the Queue(y/n):");
//TYPE YOUR CODE HERE
    
   }
}



