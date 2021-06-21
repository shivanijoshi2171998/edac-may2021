//Linear search by using method/function
/*class linearSearch
{
   static int lsearch(int a1[],int x)
   {
      int n=a1.length;
	  for(int i=0;i<=n;i++)
	  {
	    if(a1[i]==x)
		{
		return i;
		}
	  }
	  return -1;
   }
   public static void main(String args[])
   {
     int a1[]={1,2,3,4,5};
	 int x=3;
	 int result=lsearch(a1,x);
	 if (result==-1)
	 System.out.println("not found");
	 else
	    System.out.println("found");
   }
}*/

//for practice
class linearSearch
{
	static int lsearch(int arr[],int x)
	{
		int n=arr.length;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==x)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String args[])
	{
		int arr[]={1,3,75,48,54,2};
		int x=48;
		int res=lsearch(arr,x);
		if(res==-1)
		System.out.println("not found");
	else  
		System.out.println("found");
	}
}