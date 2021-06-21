//Q.19. Write a Java program to trim the capacity of an array list the current list size.

import java.util.*;
public class trimArraylist
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
	 System.out.println("let trim to size the above array:");
	 list.trimToSize();
	 System.out.println(list);
	 
	 
	}
	
}	 
 
