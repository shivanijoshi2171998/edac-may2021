//Recursion example

/*class Recursion
{
  int i=0;
  void show()
  {
    if(i<=3)
	{
	  System.out.println("hi girls");
	  i++;
	  show();
	}

  }
  public static void main(String []args)
  {
     Recursion s=new Recursion();
	 s.show();
  }
}*/

//Recursion using static keyword

class Recursion
{
	static int i=0;
	static void show()
	{
		i++;
		if(i<=3)
		{
			System.out.println("hi girls");
			show();
		}
	}
	public static void main(String args[])
	{
		System.out.println("hello");
		show();
	}
}