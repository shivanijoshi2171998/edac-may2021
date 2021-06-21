class DoublyInsertionlinkedlist
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
		  next=null;
		  prev=null;
		  
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
		public void insertafter(Node prev_node,int new_data)
		{
		  if(prev_node==null)
		  {
		     System.out.println("not possible");
			 return;
		  }
		   Node new_node=new Node(new_data);
		   new_node.next=prev_node.next;
		   prev_node.next=new_node;
		   new_node.prev=prev_node;
		   if(new_node.next!=null)
		   new_node.next.prev=new_node;
		}
		public void apppend(int new_data)
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
		   System.out.print("Traversal in forword direction\n");
		   while(node!=null)
		   {
		      System.out.print(node.data+" ");
			  temp=node;
			  node=node.next;
		   }
		   System.out.println();
		   System.out.print("Traversal in reverse direction\n");
		   while(temp!=null)
		   {
		     System.out.print(temp.data+" ");
			 temp=temp.prev;
			 
		   }
		}
		public static void main(String args[])
		{
		  DoublyInsertionlinkedlist d=new DoublyInsertionlinkedlist();
		   d.insert(10);
		   d.insert(90);
           d.apppend(11);
           d.apppend(98);
           d.insert(20);
           d.apppend(81); 
           d.apppend(40);
		   d.insertafter(d.head.next,34);
		   
		   System.out.println("Created list is:");
		   d.display(d.head);
       		   
		}
	  }		
		