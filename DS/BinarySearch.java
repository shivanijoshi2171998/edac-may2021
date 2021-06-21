//binary search using method/function

class BinarySearch
{
  static int bsearch(int arr[],int x,int l,int h)
  {
    if(h>=1)
	{
	  int mid=(l+h)/2;
	  if(arr[mid]==x)
	  return mid;
	  if(arr[mid]>x)
	  return bsearch(arr,x,l,mid-1);
	  else
	  return bsearch(arr,x,mid+1,h);
	}
	return -1;
  }
  public static void main(String args[])
  {
    int arr[]={1,2,3,4,5};
	int x=5;
	int n=arr.length;
	int res=bsearch(arr,x,0,n-1);
	if(res==-1)
	{
	  System.out.println("not found");
	}
	  else
	  {
	    System.out.println("found");
	  }
	
  }
}

// for practice
class BinarySearch
{
	static int bsearch(int arr[],int x,int l,int h)
	{
		if(h>=1)
		{
			int mid=(l+h)/2;
			if(arr[mid]==x)
				return mid;
			if(arr[mid]>x)
				return bsearch(arr,x,l,mid-1)
			else
				return bsearch(arr,x,mid+1,h)
		}
		return -1
	}
	public static void main(String args[])
	{
		int arr[]={1,2,3,4,5};
		int x=4;
		int n=arr.length;
		int res=bsearch(arr,x,0,n-1);
		if(res==-1)
		{
			System.out.println("not found");
		}
		else
			System.out.println("found");
	}
}