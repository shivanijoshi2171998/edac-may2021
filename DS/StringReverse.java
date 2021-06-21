//String reverse
class Stack
{
   private int S[];
   private int size;
   private int top;

   public Stack(int n)
   {
     size=n;
	 S=new int[size];
	 top=-1;
   }   
   public void push(int j)
   {
      S[++top]=j;
   }
   public int pop()
   {
      return S[top--];
   }
   public int peek()
   {
     return S[top];
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
	  System.out.println(S[i]);
   }
}
 class StringReverse
{
  public static void reverse(StringBuffer str)
  {
     int r=str.length();
	 Stack s=new Stack(r);
	 for(int i=0;i<r;i++)
	 s.push(str.charAt(i));
	 
	 for(int i=0;i<r;i++)
	 {
	    char ch=(char)s.pop();
		str.setCharAt(i,ch);
	 }
  }
  
	 public static void main(String args[])
	 {
	   StringBuffer s1=new StringBuffer("SHIVANI JOSHI");
	   reverse(s1);
	   System.out.println("Reverse string :"+s1);
	 }
  
}