/*Q.4.Write a Java program to retrieve an element (at a specified index) from a given 
array list.retrive means featch the specific element in the list*/

import java.util.*;

public class retriveArraylist
{
   public static void main(String args[])
   {
     ArrayList<String> list=new ArrayList<>();
	 list.add("shivani");
	 list.add("shravani");
	 list.add("gaytri");
	 list.add("mrunmayee");
	 list.add("shreesha");
	 
	 System.out.println(list);
	 System.out.println("Retrived element:" +list.get(4));
   }
}