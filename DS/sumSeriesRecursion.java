//sum of series of numbers with recursion

class sumSeriesRecursion
{
   
  public static int show(int n)
   {
    
	 if(n<=1)
	 
	     return n;
		 return n+show(n-1);
	 
   }
   public static void main(String args[])
   {
	  // Scanner sc=new Scanner(System.in);
	   //int n=sc.nextInt();
     //sumSeriesRecursion s=new sumSeriesRecursion();
	 int n=10;
	 System.out.println(show(n));
   }
}