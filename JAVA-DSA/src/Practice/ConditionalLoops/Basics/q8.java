//Perimeter Of Circle
package Practice.ConditionalLoops.Basics;
import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the radius of the circle :");
        float pi=3.1415f;
        float r= in.nextFloat();
        float a= 2*pi*r;
        System.out.println("The area is :"+a);
    }
}
