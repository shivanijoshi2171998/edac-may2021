//2. Write a Java program to iterate through all elements in a linked list

import java.util.*;
public class appendlinkedList1
{
   public static void main(String args[])
{
    LinkedList<String> list=new LinkedList<>();
	list.add("apple");
	list.add("mango");
	list.add("grapes");
	list.add("oranges");
	
	Iterator<String> itr=list.iterator();
	while(itr.hasNext())
	{
	   System.out.println(itr.next());
	}
}   
}