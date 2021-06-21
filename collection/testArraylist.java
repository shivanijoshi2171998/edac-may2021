//Q.18. Write a Java program to test if an array list is empty or not

import java.util.*;
public class testArraylist
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
	 System.out.println("check the above array list is empty or not:"+list.isEmpty());
	 list.removeAll(list);
	 System.out.println("list after remove all element:"+list);
	 System.out.println("check the above array list is empty or not:"+list.isEmpty());
	 
	 
	}
	
}	 
 
