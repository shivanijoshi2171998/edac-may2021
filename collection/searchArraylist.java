//Q.7. Write a Java program to search an element in an array list.

import java.util.*;
public class searchArraylist
{
       public static void main(String args[])
   {
     ArrayList<String> list=new ArrayList<>();
	 list.add("Apple");
	 list.add("Mango");
	 list.add("Kiwi");
	 list.add("Banana");
	 list.add("Pineapple");
	 
	 System.out.println(list);
	 if(list.contains("Mango"))
	 {
		 System.out.println("found element");
	 }
	 else
	 {
	 System.out.println("Not found");
	 }
   }

}