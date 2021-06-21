//Q.16. Write a Java program to clone an array list to another array list.

import java.util.*;
public class cloneArraylist1
{
       public static void main(String args[])
   {
     ArrayList<String> list=new ArrayList<String>();
	 list.add("Apple");
	 list.add("Mango");
	 list.add("Kiwi");
	 list.add("Banana");
	 list.add("Pineapple");
	 
	 System.out.println("original array list:"+list);
	 ArrayList<String> a= ( ArrayList<String>)list.clone();
	 System.out.println("Cloned array list:"+a);
	 
	 
	 
	}
	
}	 