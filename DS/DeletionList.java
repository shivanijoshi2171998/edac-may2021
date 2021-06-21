//deletion of data in singly linked list(delete operation in linkedlist)

class DeletionList
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
	 public void insertafter(Node prev_node,int new_data)
	 {
	   if(prev_node==null)
	   {
	     System.out.println("the given previous code cannot be null");
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
		   Node temp=head;
		   while(temp.next!=null)
		   temp=temp.next;
		   temp.next=new_node;
		   return;
	   }
	 }
	 void deleteNode(int key)
	 {
	   Node temp=head,prev=null;
	   if(temp!=null && temp.data==key)
	   {
	      head=temp.next;
		  return;
	   }
	   while(temp!=null && temp.data!=key)
	   {
	      prev=temp;
		  temp=temp.next;
	   }
	   if(temp==null)
	       return;
		   prev.next=temp.next;
	 }
	 public void deletelist()
	 {
	   head=null;
	 }
	 public static void main(String args[])
	 {
	    DeletionList d=new DeletionList();
		d.head=new Node(11);
		Node second=new Node(45);
		Node third=new Node(22);
		
		d.head.next=second;
		second.next=third;
		
		d.display();
		System.out.println(".......");
		d.insert(12);
		d.insertafter(d.head.next,99);
		d.append(78);
		d.display();
		d.deleteNode(45);
		System.out.println();
		d.display();
		d.deletelist();
		d.display();
	 }
	 
   
}