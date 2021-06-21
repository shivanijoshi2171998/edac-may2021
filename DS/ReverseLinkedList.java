//Reverse in linkedlist
class ReverseLinkedList
{
   static Node head;
   
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
   public void display(Node node)
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
	    System.out.println("the given previous node is not null");
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
	  }
   }
   Node reverse(Node node)
   {
     Node prev=null;
	 Node current=node;
	 Node next=null;
     while(current!=null)
	 {
	    next=current.next;
		current.next=prev;
		prev=current;
		current=next;
	 }
	 node=prev;
	 return node;
   }
   public static void main(String args[])
   {
      ReverseLinkedList r=new ReverseLinkedList();
	  r.head=new Node(11);
	  Node second=new Node(22);
	  Node third=new Node(33);
	  
	  r.head.next=second;
	  second.next=third;
	  
	  //r.display();
	  r.insert(10);
	  r.append(68);
	  //r.display();
	  
	  System.out.println();
	  r.display(head);
	  head=r.reverse(head);
	  System.out.println("reversed linked list");
	  r.display(head);
   }
   
}