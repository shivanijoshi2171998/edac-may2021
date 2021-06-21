//Bubble sort
class BubbleSort
{
   void bubble(int arr[])
   {
     for(int i=0;i<arr.length-1;i++)
	 {
	    for(int j=0;j<arr.length-1-i;j++)//i is the number of already sorted elements
		{
		  if(arr[j]>arr[j+1])
		  {
		    int temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
		  }
		}
	 }
   }
   void display(int arr[])
   {
     for(int i=0;i<arr.length;++i)
	 {
	    System.out.print(arr[i]+" ");
		System.out.println();
	 }
   }
   public static void main(String args[])
   {
     BubbleSort b=new BubbleSort();
	 int arr[]={64,24,10,4,89,55};
	 b.bubble(arr);
	 System.out.println("sorted array:");
	 b.display(arr);
   }
}