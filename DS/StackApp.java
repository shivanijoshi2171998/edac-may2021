//stack 

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
     return (top==-1);  //underflow
  }
  public boolean ifFull()
  {
     return (top==size-1); //overflow
  }
  public void display()
  {
     for(int i=0;i<size;i++)
	 {
	    System.out.println(S[i]);
	 }
  }
  
}
class StackApp
{
  public static void main(String args[])
  {
     Stack s1=new Stack(5);
	 s1.push(10);
	 s1.push(20);
	 s1.push(50);
	 s1.push(60);
	 s1.push(40);
	 s1.display();
  }
}