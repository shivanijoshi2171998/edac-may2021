//insertion operation in singly linked list

class InsertionList
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
	    System.out.print(n.data+"--->");
	     n=n.next;
	 }   
  }
  public void insert(int new_data)
  {
    Node new_node=new Node(new_data);
	new_node.next=head;
	head=new_node;
  }
  public void insertAfter(Node prev_node,int new_data)
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
	 {
	    if(head==null)
		{
		    head=new Node(new_data);
			return;
		}
		new_node.next=null;
		Node last=head;
		while(last.next!=null)
		last=last.next;
		last.next=new_node;
		return;
	 }
  }
	 public static void main(String args[])
	 {
	    InsertionList l=new InsertionList();
		l.head=new Node(11);
		Node second=new Node(22);
		Node third=new Node(56);
		
		l.head.next=second;
		second.next=third;
		
		l.display();
		System.out.println("------------");
		l.insert(32);
		l.insertAfter(l.head.next,67);
		l.append(88);
		l.display();
	 }
  
}