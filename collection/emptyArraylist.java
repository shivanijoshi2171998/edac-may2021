//Q.17. Write a Java program to empty an array list.

import java.util.*;
public class emptyArraylist
{
       public static void main(String args[])
   {
     ArrayList<String> list=new ArrayList<String>();
	 list.add("Apple");
	 list.add("Mango");
	 list.add("Kiwi");
	 list.add("Banana");
	 list.add("Pineapple");
	 
	 System.out.println("original list:"+list);
	 list.removeAll(list);
	 System.out.println("list after remove all element:"+list);
	 
	 
	}
	
}	 
 
