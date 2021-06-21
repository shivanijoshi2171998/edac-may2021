//Q.6. Write a Java program to remove the third element from an array list.

import java.util.*;
public class removeArraylist
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
	 list.remove(3);
	 System.out.println("After removing element:"+list);
   }

}