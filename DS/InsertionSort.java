//Insertion sort
class InsertionSort
{
  public void sort(int arr[])
  {
     for(int i=0;i<arr.length;i++)
	 {
	    int key=arr[i];
		int j=i-1;
		
		while(j>=0 && arr[j]>key)
		{
		  arr[j+1]=arr[j];
		  j=j-1;
		}
		arr[j+1]=key;
	 }
  }
  void display(int arr[])
  {
    for(int i=0;i<arr.length;i++)
	{
	  System.out.print(arr[i]+" ");
	 
	}
  }
  public static void main(String args[])
  {
    InsertionSort s=new InsertionSort();
	int arr[]=new int[]{42,7,12,55,87,22,90};
	s.sort(arr);
	s.display(arr);
  }
  
}