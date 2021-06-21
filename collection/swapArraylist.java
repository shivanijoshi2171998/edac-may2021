//Q.14. Write a Java program of swap two elements in an array list.

import java.util.*;
public class swapArraylist
{
       public static void main(String args[])
   {
     ArrayList<String> list=new ArrayList<String>();
	 list.add("Apple");
	 list.add("Mango");
	 list.add("Kiwi");
	 list.add("Banana");
	 list.add("Pineapple");
	 
	 System.out.println("before swap:"+list);
	 Collections.swap(list,0,2);
	 System.out.println("after swap:");
	 for(String a:list)
	 {
	    System.out.println(a);
	 }
	 
	 
	}
	
}	 