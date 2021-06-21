//pallindrom in string using stack
import java.util.*;
class StringPallindrom
{
  int arr[];
  int size;
  int top;
  
  public StringPallindrom(int d)
  {
     arr=new int[size];
	size=d;
	top=-1;
  }
  public void push(int j)
  {
    arr[++top]=j;
  }
  public int pop()
  {
    return arr[top--];
  }
  public boolean isEmpty()
  {
     return (top==-1);
  }
  public boolean isFull()
  {
     return (top==size-1);
  }
  public void display()
  {
     for(int i=0;i<size;i++)
	 System.out.println(arr[i]);
  }
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
	 System.out.println("enter a string");
	 String str=sc.nextLine();
	 sc.close();
	 
	 //int len=str.length();
	 StringPallindrom stack=new StringPallindrom(str.length());
	 for(int i=0;i<str.length();i++)
	 {
	   stack.push(str.charAt(i));
	 }
	 String reverseString="";
	 while(!stack.isEmpty())
	 {
		 reverseString=reverseString+stack.pop();
	 }
	 if(str.equals(reverseString))
		 System.out.println("pallindrom");
	 else
		 System.out.println("not pallindrom");
	/* System.out.println(str);
	 for(int i=0;i<=len;i++)
	 {
	    if(stack.arr[stack.top]!=str.charAt(i))
		{
		  break;
		}
		stack.pop();
	 }
	 if(stack.isEmpty())
	 {
	    System.out.println("pallindrom");
	 }
	 else
	 {
	    System.out.println("not pallindrom");
	 }*/
  }
}