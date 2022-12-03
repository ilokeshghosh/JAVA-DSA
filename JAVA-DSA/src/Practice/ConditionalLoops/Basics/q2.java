//Area Of Triangle
package Practice.ConditionalLoops.Basics;
import java.util.Scanner;
public class q2 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the base(cm) of the triangle : ");
        float b= in.nextFloat();
        System.out.print("Enter the height(cm) of the triangle : ");
        float h = in.nextFloat();
        float a= 0.5f*(b*h);
        System.out.println("The area of the triangle of height"+h+"cm and base of length "+b+"cm is : "+a);
    }
}
