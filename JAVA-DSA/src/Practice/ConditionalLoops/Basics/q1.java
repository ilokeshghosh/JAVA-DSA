//Area Of Circle Java Program
package Practice.ConditionalLoops.Basics;
import java.util.Scanner;
public class q1 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        float pi=3.1415f;
        System.out.print("Enter the radius(cm) of the circle : ");
        float r=in.nextFloat();
        System.out.println("The area of the circle of radius "+r+"cm is "+pi*(r*r));

    }
}
