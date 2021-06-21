//Q.10 Write a Java program to shuffle elements in an array list

import java.util.*;
public class shuffleArraylist
{
       public static void main(String args[])
   {
     ArrayList<String> list=new ArrayList<>();
	 list.add("Apple");
	 list.add("Mango");
	 list.add("Kiwi");
	 list.add("Banana");
	 list.add("Pineapple");
	 
	 System.out.println("before shuffling"+list);
	 Collections.shuffle(list);
	 System.out.println("after shuffling"+list);
	 
	 
	}
	
}	 