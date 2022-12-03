//Perimeter Of Rectangle
package Practice.ConditionalLoops.Basics;
import java.util.Scanner;

public class q11 {



        public static void main(String[] args) {
            Scanner in= new Scanner(System.in);
            System.out.println("Enter the Length of the Rectangle  :");
            float l=in.nextFloat();
            System.out.println("Enter the Breadth of the Rectangle :");
            float b=in.nextFloat();
            float a= 2*(l+b);
            System.out.println("The perimeter of the Rectangle is : "+a);


    }

}
