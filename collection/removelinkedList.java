//remove element in linkedlist

import java.util.*;

public class removelinkedList
{
  public static void main(String args[])
  {
     LinkedList<String> list=new LinkedList<>();
	 list.add("black");
	 list.add("white");
	 list.add("blue");
	 list.add("green");
	 list.add("pink");
	 list.add("orange");
	 
	 System.out.println("before removing:"+list);
	 
	 list.remove("blue");
	 System.out.println("after removing:"+list);
	 
  }
}
