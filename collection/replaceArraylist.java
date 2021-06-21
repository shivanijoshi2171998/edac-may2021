//Q.21. Write a Java program to replace the second element of an ArrayList with the specified element.

import java.util.*;
public class replaceArraylist
{
   public static void main(String args[])
   {
     ArrayList<String> list=new ArrayList<>();
	 
	 list.add("green");
	 list.add("black");
	 
	 System.out.println("original array list:"+list);
	 String newcolor="red";
	 list.set(1,newcolor);
	 
	 int num=list.size();
	 System.out.println("Replace second element ");
	 for(int i=0;i<num;i++)
	 System.out.println(list.get(i));
   }
}