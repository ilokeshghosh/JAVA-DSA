//Volume Of Cylinder
package Practice.ConditionalLoops.Basics;
import java.util.Scanner;

public class q16 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        float pi=3.1415f;
        System.out.println("Enter the radius of the cylinder :");
        float r=in.nextFloat();
        System.out.println("Enter the height of the cylinder :");
        float h=in.nextFloat();
        float v= pi*(r*r)*h;
        System.out.println("The volume of the cylinder is :"+v);
    }
}
