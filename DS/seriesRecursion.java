//Print the series of numbers with recursion

class seriesRecursion
{
  int i=1;
  void show()
  {
    System.out.println(i);
	
	if(i>=10)
	{
	  
	}
	else
	{
		i++;
	   show();
	}
  }
  public static void main(String args[])
  {
     seriesRecursion r=new seriesRecursion();
	 r.show();
  }
}