//Subtract the Product and Sum of Digits of an Integer
package Practice.ConditionalLoops.Basics;
import java.util.Scanner;

public class q22 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n =in.nextInt();
        int sum=0;
        int pro=1;
        int org=n;
       while(n!=0){
           int r=n%10;
           sum=sum+r;
           pro=pro*r;
           n/=10;

       }
        System.out.println("The final answer is : "+(pro-sum));
    }
}
