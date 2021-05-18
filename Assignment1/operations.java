//sixth program
import java.util.Scanner;
public class operations
{
   public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
   System.out.println("enter first number:");
   int i=sc.nextInt();
   System.out.println("enter second number:");
  int j=sc.nextInt();
  int k=i+j;
 int l=i-j;
 int m=i*j;
 int n=i/j;
int p=i%j;

  System.out.println("addition:"+k);
  System.out.println("subtraction:"+l);
  System.out.println("multiplication:"+m);
  System.out.println("division:"+n);
  System.out.println("mod:"+p);
} 
}