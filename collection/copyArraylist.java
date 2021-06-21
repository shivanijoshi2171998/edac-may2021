//Q.9. Write a Java program to copy one array list into another

import java.util.*;
public class copyArraylist
{
       public static void main(String args[])
   {
     ArrayList<String> list1=new ArrayList<>();
	 list1.add("Apple");
	 list1.add("Mango");
	 list1.add("Kiwi");
	 list1.add("Banana");
	 list1.add("Pineapple");
	 
	 System.out.println("list1: " + list1);
	 
      ArrayList<String> list2 = new ArrayList<String>();
      list2.add("A");
      list2.add("B");
      list2.add("C");
      list2.add("D");
	  list2.add("E");
	   
	   System.out.println("list2: " + list2);
	   Collections.copy(list1,list2);
	   System.out.println("list1:"+list1);
	   System.out.println("list2:"+list2);
	 
	}
	
}	
 