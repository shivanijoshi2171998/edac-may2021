//Q.20. Write a Java program to increase the size of an array list

import java.util.*;
public class increaseArraylist
{
	public static void main(String args[])
	{
   ArrayList<String> c1=new ArrayList<>(3);
   c1.add("green");
   c1.add("blue");
   c1.add("red");
   
   System.out.println("original array:"+c1);
   
   c1.ensureCapacity(6);
   c1.add("black");
   c1.add("pink");
   c1.add("yellow");
   
   System.out.println("new araylist:" +c1);
	}
}