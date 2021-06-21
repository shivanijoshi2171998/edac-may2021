//fibonacci series using recursion

class fibonacciRecursion
{
  static int fibo(int n)
  {
     if(n<=1)
	 {
	    return n;
	 }
	 return fibo(n-1)+fibo(n-2);
  }
  public static void main(String args[])
  {
    int k=10;
	for(int i=0;i<=k;i++)
	System.out.print(fibo(i)+" ");
  }
}