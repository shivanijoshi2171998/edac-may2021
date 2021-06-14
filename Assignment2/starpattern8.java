class starpattern8
{
  public static void main(String args[])
  {
    for(int i=1;i<=4;i++)
	{
	  for(int j=4;j>=i;j--)
	  {
	    System.out.print(" ");
	  }
	   for(int k=1;k<=i;k++)
	   {
		   System.out.print("*");
	   }
	   for(int l=2;l<=i;l++)
	   {
		   System.out.print("*");
	   }
	    for(int m=1;m<4;m++)
	{
	 for(int n=1;n<=i;n++)
	 {
	   System.out.print(" ");
	 }
	  for(int k=4;k>=i;k--)
	  {
	    System.out.print("*");
	  }
	  for(int l=3;l>=i;l--)
	  {
	    System.out.print("*");
	  }
	  System.out.println();
	}
	}
  }
}