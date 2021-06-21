class DoublyDeletionlinkedlist
{
  Node head;
  
  class Node
  {
     int data;
	 Node next;
	 Node prev;
	 
	 Node(int d)
	 {
	   data=d;
	 }
  }
  public void insert(int new_data)
  {
    Node new_node=new Node(new_data);
	new_node.next=head;
	new_node.prev=null;
	if(head!=null)
	head.prev=new_node;
	head=new_node;
  }
  public void inserafter(Node prev_node,int new_data)
  {
     if(prev_node==null)
	 {
	    System.out.println("the given previous node cannot be null");
		return;
	 }
	 Node new_node=new Node(new_data);
	 new_node.next=prev_node.next;
	 prev_node.next=new_node;
	 new_node.prev=prev_node;
	 if(new_node.next!=null)
	 new_node.next.prev=new_node;
  }
  public void append(int new_data)
  {
      Node new_node=new Node(new_data);
	  Node temp=head;
	  new_node.next=null;
	  if(head==null)
	  {
	  new_node.prev=null;
	  head=new_node;
	  return;
	  }
	  while(temp.next!=null)
	  temp=temp.next;
	  temp.next=new_node;
	  new_node.prev=temp;
  }
  void display(Node node)
  {
     Node temp=null;
	 System.out.println("-------------------------");
	 System.out.println();
	 System.out.println("Traverse in forword direction");
	 while(node!=null)
	 {
	    System.out.print(node.data+" ");
		temp=node;
		node=node.next;
	 }
	 System.out.println();
	 System.out.println("traverse in reverse direction");
	 while(temp!=null)
	 {
	 System.out.print(temp.data+" ");
	 temp=temp.prev;
	 }
	 System.out.println();
  }
  void deletenode(Node del)
  {
      //base case
	  if(head==null || del==null)
	  {
	  return;
	  }
	  if(head==del)
	  {
	    head=del.next;
	  }
	  if(del.next!=null)
	  {
	     del.next.prev=del.prev;
	  }
	  if(del.prev!=null)
	  {
	      del.prev.next=del.next;
	  }
	  return;
  }
  
  public static void main(String args[])
  {
     DoublyDeletionlinkedlist d=new DoublyDeletionlinkedlist();
	 d.insert(10);
	 d.insert(20);
      d.insert(55);
	  d.insert(80);
	  d.append(60);
	  d.inserafter(d.head.next,66);
	  d.display(d.head);
	  System.out.println();
	  System.out.println("After deletion...");
	  d.deletenode(d.head.next);
	  d.display(d.head);
  }
}