class invertedpyramidpattern6
{
  public static void main(String args[])
  {
  for(int i=5;i>=1;i--)
  {
    for(int j=i;j<=5;j++)
	{
	  System.out.print(" ");
	}
  
  for(int k=1;k<=(2*i-1);k++)
  {
    System.out.print("*");
   }
   //for(int l=1;l<=i;l++)
   //{

      //System.out.print("*");	   
  // }
   System.out.println();
  }
  }
}  