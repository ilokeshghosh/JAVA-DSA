package Practice.ConditionalLoops.Basics;
import java.util.Scanner;

//Perimeter Of Parallelogram
public class q10 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the Length of the parallelogram :");
        float l=in.nextFloat();
        System.out.println("Enter the Breadth of the parallelogram :");
        float b=in.nextFloat();
        float a= 2*(l+b);
        System.out.println("The perimeter of the parallelogram is : "+a);

    }
}
