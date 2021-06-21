//Insert in binary tree
class InsertBinaryTree
{
   Node root;
    
	 static class Node
	 {
	   int data;
       Node left,right;

     Node(int d)
     {
	   data=d;
	   left=right=null;
	 }	 
	 }
	 InsertBinaryTree()
	 {
	    root=null;
	 }
	 InsertBinaryTree(int d)
	 {
	    root=new Node(d);
	 }
	 void Inorder(Node node)
	 {
	   if(node==null)
	   return;
	   Inorder(node.left);
	   System.out.print(node.data+" ");
	   Inorder(node.right);
	 }
	 void preorder(Node node)
	 {
	   if(node==null)
	   return;
	   System.out.print(node.data+" ");
	   preorder(node.left);
	   preorder(node.right);
	 }
	 void postorder(Node node)
	 {
	   if(node==null)
	   return;
	   postorder(node.left);
	   postorder(node.right);
	   System.out.print(node.data+" ");
	 }
	 void Inorder()
	 {
	    Inorder(root);
	 }
	 void preorder()
	 {
	    preorder(root);
	 }
	 void postorder()
	 {
	    postorder(root);
	 }
	 public static void main(String args[])
	 {
	  InsertBinaryTree t=new InsertBinaryTree();
       t.root=new Node(1);
       t.root.left=new Node(2);
       t.root.right=new Node(3);
        t.root.left.left=new Node(4);
        t.root.left.right=new Node(5);	

       System.out.println("Inorder traversal :");
        t.Inorder();
        System.out.println("\npreorder traversal :");
        t.preorder();
        System.out.println("\npostorder traversal :");
        t.postorder();		
	 }
}