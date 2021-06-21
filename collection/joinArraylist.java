//Q.15. Write a Java program to join two array lists.

import java.util.*;
public class joinArraylist
{
   public static void main(String args[])
   {
      ArrayList<String>list1=new ArrayList<>();
	  list1.add("red");
	  list1.add("black");
	  list1.add("white");
	  list1.add("green");
	  list1.add("pink");
	  System.out.println("list of first array:"+list1);
	  
	  ArrayList<String> list2=new ArrayList<>();
	  list2.add("red");
	  list2.add("pink");
	  list2.add("black");
	  list2.add("green");
	  System.out.println("list of second array:"+list2);
	  ArrayList<String> a=new ArrayList<String>();
	  a.addAll(list1);
	  a.addAll(list2);
	  System.out.println("new array:"+a);
	  
	}
}	
	  