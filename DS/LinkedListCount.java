//Linked list
class LinkedListCount
{
  Node head;
  
  static class Node
  {
     int data;
	 Node next;
	 
	 Node(int d)
	 {
	    data=d;
		next=null;
	 }
  }
  public void display()
  {
     Node n=head;
	 while(n!=null)
	 {
	    System.out.println(n.data+" ");
		n=n.next;
	 }
  }
  public void insert(int new_data)
  {
     Node new_node=new Node(new_data);
	 new_node.next=head;
	 head=new_node;
  }
  public void insertafter(Node prev_node,int new_data)
  {
	if(prev_node==null)
	{
	  System.out.println("the given previous node cannot be null");
	  return;
	}
	Node new_node=new Node(new_data);
	new_node.next=prev_node.next;
	prev_node.next=new_node;
  }
  public void append(int new_data)
  {
    Node new_node=new Node(new_data);
	if(head==null)
	{
	   head=new Node(new_data);
	   return;
	}
	new_node.next=null;
	Node temp=head;
	if(temp.next!=null)
	{
	  temp=temp.next;
	  temp.next=new_node;
	  return;
	  
	}
  }
  public int countNode()
  {
     Node temp=head;
     int count=0;
	 while(temp!=null)
	 {
	    count++;
	    temp=temp.next;
	 }
	 return count;
  }
  public static void main(String args[])
  {
    LinkedListCount c=new LinkedListCount();
	c.head=new Node(20);
	Node second=new Node(40);
	Node third=new Node(12);
	
	c.head.next=second;
	second.next=third;
	
	c.display();
	System.out.println(".........");
	c.insert(44);
	c.insert(10);
	c.insert(88);
	
	System.out.println();
	c.display();
	
	System.out.println();
	System.out.println("count of nodes:"+c.countNode());
  }
}