/*Q.3. Write a Java program to insert an element into the array list at the first 
position.*/

import java.util.*;
public class insertArraylist
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
	
	list.add(0,0);
	for(Integer x:list)
	{
	  System.out.println(x);
	}
  }
}