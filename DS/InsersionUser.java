/*Sorting One common task for computers is to sort data. For example, people might want to see all their files on a computer sorted by size. Since sorting is a simple problem with many different possible solutions, it is often used to introduce the study of algorithms.

Insertion Sort These challenges will cover Insertion Sort, a simple and intuitive sorting algorithm. We will first start with a nearly sorted list.

Insert element into sorted list Given a sorted list with an unsorted number n in the rightmost cell, can you write some simple code to insert n into the array so that it remains sorted?

Example

n=5 arr[]={2, 4, 6, 8, 3} Start at the rightmost index. Store the value of . Compare this to each element to the left until a smaller value is reached. Here are the results as described:

1 2 4 5 5 1 2 4 4 5 1 2 3 4 5

Input Format

5 2 4 6 8 3

Constraints

1<=n<=1000

Output Format

2 4 6 8 3 2 4 6 8 3 2 4 6 8 3 2 3 4 6 8 2 3 4 6 8

Sample Input 0

5
2 4 6 8 3
Sample Output 0

2 4 6 8 3 
2 4 6 8 3 
2 4 6 8 3 
2 3 4 6 8 
2 3 4 6 8 */ 


import java.util.Scanner;

public class InsersionUser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
        int s=scan.nextInt();
        int ar[]=new int[s];
        boolean check=false;
        for(int i=0;i<s;i++)
        {
            ar[i]=scan.nextInt();
        }
        int var=ar[s-1];
        for(int i=s-2;i>=-1;i--)
        {
            if(i!=-1)
            {
            if(var<ar[i])
            {
                ar[i+1]=ar[i];
            }
            else
            {
                ar[i+1]=var;
                check=true;
            }
            }
            else
            {
                ar[0]=var;
            }
            for(int j=0;j<s;j++)
                System.out.print(ar[j]+" ");
            System.out.println();
            if(check)
                break;
        }
    }
}
