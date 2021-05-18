//que 22
/*class binarytodecimal
{
  public static void main(String args[])
  {
     int temp;
	 int dec=0,pow=1,rem;
	 int n=1010;
	 temp=n;
	 while(n>0)
	 {
	   rem=n%10;
	   dec=dec+rem*pow;
	   n=n/10;
       pow=pow*2;	   
	 }
	 System.out.println("binary num is:"+temp);
	  System.out.println("decimal um is:"+dec);
	 }
  }*/
  
  //taking input from user
  import java.util.Scanner;
  public class binarytodecimal
  {
     public static void main(String args[])
	 {
		 int dec=0,pow=1,rem,temp;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter a binary number:");
		 int n=sc.nextInt();
		 temp=n;
		 while(n>0)
		 {
			 rem=n%10;
			 dec=dec+rem*pow;
			 n=n/10;
			 pow=pow*2;
		 }
		 System.out.println("decimal num is:"+dec);
	 }
     	  
  }
