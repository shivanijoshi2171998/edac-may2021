//copy the elements of one array to another array

class copyArray
{
   public static void main(String args[])
   {
      int arr1[]=new int[]{1,2,3,4,5};
	  int arr2[]=new int[arr1.length];
	  
	  for(int i=0;i<arr1.length;i++)
	  {
	    arr2[i]=arr1[i];
	  }
	  //Displaying elements of arr1
	  System.out.println("Array1 elements:");
	  for(int i=0;i<arr1.length;i++)
	  {
	     System.out.print(arr1[i]+" ");
	  }
	  System.out.println();
	  System.out.println("copies elements in array2:");
	  for(int i=0;i<arr2.length;i++)
	  {
	     System.out.print(arr2[i]+" ");
	  }
   }
}