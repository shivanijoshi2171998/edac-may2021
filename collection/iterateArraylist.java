//Q.2. Write a Java program to iterate through all elements in an array list.

import java.util.*;
public class iterateArraylist
{
  public static void main(String args[])
  {
    ArrayList<Integer> list=new ArrayList<>();
	list.add(1);
	list.add(2);
	list.add(4);
	list.add(5);
	list.add(9);
	list.add(6);
	
	Iterator<Integer> itr=list.iterator();
	while(itr.hasNext())
	{
	  System.out.println(itr.next());
	}
  }
}