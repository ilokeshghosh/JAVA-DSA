//Volume Of Pyramid
package Practice.ConditionalLoops.Basics;
import java.util.Scanner;

public class q18 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the length of the pyramid :");
        float l=in.nextFloat();
        System.out.println("Enter the width of the pyramid :");
        float w=in.nextFloat();
        System.out.println("Enter the height of the pyramid :");
        float h=in.nextFloat();
        float v=0.3333f*l*w*h;
        System.out.println("The volume of the pyramid is : "+v);
    }
}
