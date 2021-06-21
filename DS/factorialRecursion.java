// Recursion factorial

/*class factorialRecursion
{
   static int fact(int n)
  {
    if(n<=1)
	{
	  return 1;
	}
	else
	{
	   return n*fact(n-1);
	   //fact();
	}
  }
  public static void main(String args[])
  {
     System.out.println(fact(5));
  }
}*/

import java.util.*;
class factorialRecursion
{
  
  int fact=1;
  int print(int n )
  {
	 if(n>=1)					
	  {
	  fact = n * print(n-1);
	  //System.out.println(fact);
	  }
	  return fact;	
  }  
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  int num=sc.nextInt();
	  factorial f = new factorial();
	  //int res = f.print(num);
	 // System.out.println(res);
	  	  System.out.println(f.print(num));
  }
}