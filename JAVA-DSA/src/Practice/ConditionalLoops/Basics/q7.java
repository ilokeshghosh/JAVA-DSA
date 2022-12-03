//Area Of Equilateral Triangle
package Practice.ConditionalLoops.Basics;
import java.util.Scanner;
public class q7 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the side of the triangle : " );
        float s=in.nextFloat();
        float r= (float)(Math.sqrt(3));
        float a= 0.25f*(s*s)*r;
        System.out.println("The area of Equilateral triangle is : "+a);

    }
}
