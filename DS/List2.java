//program for print the nodes in the linked list

class List2
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
  public static void main(String args[])
  {
     List2 l=new List2();
	 l.head=new Node(11);
	 Node second=new Node(22);
	 Node third=new Node(45);
	 
	 l.head.next=second;
	 second.next=third;
	 
	 l.display();
  }
}