//seventh program = print a table of 8
/*import java.util.Scanner;
public class multiplicationtable
{
   public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
   int num=sc.nextInt();
   for(int i=0; i<10; i++)
{
    System.out.println(num + "x" +(i+1) +"=" +(num *(i+1)));
}
}
}*/

// second method to print table
public class multiplicationtable
{
  public static void main(String args[])
{
   int num=8;
for(int i=1; i<=10; ++i)
{
   System.out.print("%d * %d=%d\n",num, i, num*i);
}
}
}