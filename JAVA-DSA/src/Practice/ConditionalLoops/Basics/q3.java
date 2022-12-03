//Area Of Rectangle Program
package Practice.ConditionalLoops.Basics;
import java.util.Scanner;

public class q3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length(cm) of the rectangle : ");
        float l= in.nextFloat();
        System.out.print("Enter the breadth(cm) of the rectangle : ");
        float b= in.nextFloat();
        float a=l*b;
        System.out.println("The area of the rectangle of length"+l+"cm and breadth of "+b+"cm is :"+a);


    }

}
