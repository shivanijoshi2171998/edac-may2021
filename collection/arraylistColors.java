/*Q.1 Write a Java program to create a new array list, 
add some colors (string) and print out the collection*/

import java.util.*;
class arraylistColors
{
   public static void main(String args[])
   {
      ArrayList<String> list=new ArrayList<>();
	  list.add("white");
	  list.add("black");
	  list.add("pink");
	  list.add("red");
	  
	  for(String x:list)
	  {
	     System.out.println(x);
	  }
   }
}