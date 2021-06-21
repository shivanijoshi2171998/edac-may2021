//Q.5. Write a Java program to update specific array elements by a given element.

import java.util.*;
public class updateArraylist
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
	 list.set(2,"Oranges");
	 System.out.println(list);
   }
} 