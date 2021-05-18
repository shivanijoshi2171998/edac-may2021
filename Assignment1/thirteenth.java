//thirteenth program
import java.util.Scanner;
public class thirteenth
{
   public static void main(String args[])
 {  
    Scanner sc=new Scanner(System.in);
   System.out.println("enter the height of rectangle:");
   double h=sc.nextDouble();
  System.out.println("enter the width of rectangle:");
  double w=sc.nextDouble();
  double area=h*w;
  double perimeter=2*(h+w);
// System.out.println(k);
 System.out.println("area:"+area);
 System.out.println("perimeter:"+perimeter);

}
}