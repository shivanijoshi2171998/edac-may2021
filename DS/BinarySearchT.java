//Binary search tree
class BinarySearchT
{
   Node root;
    
	class Node
    {
	  int data;
	  Node left,right;
	  
	  Node(int d)
	  {
	    data=d;
         left=null;
         right=null;		 
	  }
	}
	BinarySearchT()
	{
	    root=null;
	}
	void insert(int key)
	{
	   root=insertData(root,key);
	}
	Node insertData(Node root,int key)
	{
	   if(root==null)
	   {
	      root=new Node(key);
		  return root;
	   }
	   if(key<root.data)
	   {
	     root.left=insertData(root.left,key);
	   }
	   else
	   {
	       root.right=insertData(root.right,key);
	   }
	   return root;
	}
	void Inorder()
	{
	    Inorder(root);
	}
	void Inorder(Node root)
	{
	  if(root!=null)
	  {
	     Inorder(root.left);
		 System.out.print(root.data+" ");
		 Inorder(root.right);
	  }
	}
	public static void main(String args[])
	{
	   BinarySearchT t=new BinarySearchT();
	   t.insert(55);
	   t.insert(33);
	   t.insert(60);
	   t.insert(77);
	   t.insert(24);
	   t.insert(44);
	   
	   t.Inorder();
	}
}
//output:- Inorder
//24 33 44 55 60 77