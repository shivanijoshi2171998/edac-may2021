//Q.12. Write a Java program to extract a portion of an array list

import java.util.*;
public class extractArraylist
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
	 ArrayList<String> sub_List= list.subList(1,3);
	 System.out.println("list after extract:"+sub_List);
	 
	 
	}
	
}	 
 
