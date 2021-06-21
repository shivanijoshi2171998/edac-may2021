//Deletion operation in binary search tree
class DeleteBinarySearch
{
  Node root;
  
  class Node
  {
     int data;
	 Node left,right;
	 
	 Node(int d)
	 {
	   data=d;
	 }
  }
  DeleteBinarySearch()
  {
    root=null;
  }
  void delete(int key)
  {
    root=deleteData(root,key);
  }
  Node deleteData(Node root,int key)
  {
     //empty tree
	 if(root==null)
	 return root;
	 
	 if(key<root.data)
	     root.left=deleteData(root.left,key);
	 else if(key>root.data)
	      root.right=deleteData(root.right,key);
		  
	 else 
        {
           //node with only one child or no child
		   if(root.left==null)
		   return root.right;
		   else if(root.right==null)
		   return root.left;
		   
		   
		   //node with two child: get the inorder
		   //successor(smallest in the right subtree)
		   root.data=minvalue(root.right);
		   
		   //delete the inorder successor
		   root.right=deleteData(root.right,root.data);
		   
		}	 
		return root;
  }
  int minvalue(Node root)
  {
     int minv=root.data;
	 while(root.left!=null)
	 {
	    minv=root.left.data;
		root=root.left;
	 }
	 return minv;
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
	   root.left=insertData(root.left,key);
	   
	 else if(key>root.data)
      root.right=insertData(root.right,key);

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
     DeleteBinarySearch b=new DeleteBinarySearch();
	 b.insert(55);
	 b.insert(65);
	 b.insert(21);
	 b.insert(68);
	 b.insert(98);
	 b.insert(34);
	 b.insert(59);
	 
	 System.out.println("Inorder traversal of the given tree");
	 b.Inorder();
	 
	 System.out.println("\nDelete 21.......");
	 b.delete(21);
	 System.out.println("Inorder traversal of the modified tree");
	 b.Inorder();
	 
	 System.out.println("\nDelete 98.......");
	 b.delete(98);
	 System.out.println("Inorder traversal of the modified tree");
	 b.Inorder();
  }
}