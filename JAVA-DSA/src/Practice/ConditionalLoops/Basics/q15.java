//Volume Of Prism
package Practice.ConditionalLoops.Basics;

import java.util.Scanner;


public class q15 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the height of the Prism :");
        float h=in.nextFloat();
        System.out.println("Enter the base of the Prism :");
        float b=in.nextFloat();
        System.out.println("The Volume of the prism is : "+h*b);

    }
}
