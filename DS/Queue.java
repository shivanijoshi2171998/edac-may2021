//Queue

class Queue
{
   private int count;
   private int arr[];
   private int front;
   private int rear;
   private int capacity;
   
   public Queue(int size)
   {
      capacity=size;
	  arr=new int[size];
	  front=0;
	  rear=-1;
	  count=0;
   }
    public void enqueue(int item)
   {
      if(isFull())
	  {
	    System.out.println("overflow");
		System.exit(1);
	  }
	  System.out.println("Inserting:"+item);
	  rear=(rear+1)%capacity;
	  arr[rear]=item;
	  count++;
   }
   public void dequeue()
   {
     if(isEmpty())
	 {
	    System.out.println("underflow");
		System.exit(0);
	 }
	 System.out.println("Removing:"+arr[front]);
	 front=(front+1)%capacity;
	 count--;
   }
   
   public int peek()
   {
   if(isEmpty())
   {
      System.out.println("underflow");
	  System.exit(1);
   }
      return arr[front];
   }
   public int size()
   {
      return count;
   }
   public boolean isEmpty()
   {
      return (size()==0);
   }
   public boolean isFull()
   {
      return (size()==capacity);
   }
   public void display()
   {
	   for(int i=0;i<count;i++)
		   System.out.println(arr[i]);
   }
   public static void main(String args[])
   {
       Queue q=new Queue(5);
	   q.enqueue(1);
	   q.enqueue(2);
	   q.enqueue(4);
	   q.enqueue(6);
	   q.display();
	   //q.enqueue(3);
	   /*
	   System.out.println("The front element is:"+q.peek());
	   System.out.println("The queue size is:"+q.size());
	   
	   if(q.isEmpty())
	   {
		   System.out.println("the queue is empty");
	   }
	   else
	   {
		   System.out.println("the queue is not empty");
	   }
	   */
   }
}