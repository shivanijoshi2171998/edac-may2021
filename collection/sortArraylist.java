//Q.8. Write a Java program to sort a given array list. 



import java.util.*;
public class sortArraylist
{
       public static void main(String args[])
   {
     ArrayList<String> list=new ArrayList<>();
	 list.add("Apple");
	 list.add("Mango");
	 list.add("Kiwi");
	 list.add("Banana");
	 list.add("Pineapple");
	 
	 System.out.println("before sorting"+list);
	 Collections.sort(list);
	 System.out.println("after sorting"+list);
	 
	 
	}
	
}	
	