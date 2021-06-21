//queue
class queue1
{
  private int arr[];
  private int size=5;
  private int rear;
  private int front;
  
  public queue1(int s)
  {
    arr=new int[5];
	size=s;
	rear=0;
	front=0;
  }
  public void enqueue(int data)
  {
  if(isFull())
  {
     System.out.println("overflow");
  }
  else
  {
    arr[rear]=data;
	rear++;
  }
  }
  public void dequeue()
  {
  if(isEmpty())
  {
     System.out.println("underflow");
  }
  else
  {
    front++;
  }
  }
  public boolean isEmpty()
  {
    if(rear==front)
	{
	   rear=0;
	   front=0;
	   return true;
	}
	else
	{
	   return false;
	}
  }
  public boolean isFull()
  {
    if(rear==size && rear==front)
	{
	   rear=0;
	   front=0;
	   return false;
	}
	else if(rear==size)
	{
	  return true;
	}
	else
	 return false;
  }
  public void peek()
  {
   System.out.println(arr[front]);
  }
  public void display()
  {
    for(int i=0;i<size;i++)
	System.out.println(arr[i]);
  }
  public static void main(String args[])
  {
    queue1 q=new queue1(4);
	q.enqueue(20);
	q.enqueue(10);
	q.enqueue(21);
	q.peek();
	q.enqueue(56);
	q.dequeue();
	q.dequeue();
	q.display();
	
	
  }
}