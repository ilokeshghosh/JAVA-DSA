//Curved Surface Area Of Cylinder
package Practice.ConditionalLoops.Basics;
import java.util.Scanner;

public class q19 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder : ");
        float r=in.nextFloat();
        System.out.println("Enter the height of the cylinder : ");
        float h=in.nextFloat();
        float pi=3.1415f;
        float v=2*pi*r*h;
        System.out.println("The curved surface area of the cylinder is : "+v);


    }
}
