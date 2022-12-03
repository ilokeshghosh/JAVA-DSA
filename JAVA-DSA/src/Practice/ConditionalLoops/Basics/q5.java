//Area Of Parallelogram
package Practice.ConditionalLoops.Basics;
import java.util.Scanner;

public class q5 {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the breadth of the Parallelogram : ");
        float b= in.nextFloat();
        System.out.print("Enter the height of the parallelogram : ");
        float h=in.nextFloat();
        float a=b*h;
        System.out.println("The area of the parallelogram of breadth is "+b+"cm and height of "+h+"cm is : "+a);
    }
}
