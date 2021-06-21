//Q.13. Write a Java program to compare two array lists

import java.util.*;
public class compareArraylist
{
   public static void main(String args[])
   {
      ArrayList<String>list1=new ArrayList<>();
	  list1.add("red");
	  list1.add("black");
	  list1.add("white");
	  list1.add("green");
	  list1.add("pink");
	  
	  ArrayList<String> list2=new ArrayList<>();
	  list2.add("red");
	  list2.add("pink");
	  list2.add("black");
	  list2.add("green");
	  
	  ArrayList<String>c1=new ArrayList<>();
	  for(String e:list1)
	  c1.add(list2.contains(e) ? "yes" : "no");
	  System.out.println(c1);
	  
   }
}