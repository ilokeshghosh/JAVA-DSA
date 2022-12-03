package Practice.ConditionalLoops.Basics;
import java.util.Scanner;

//Perimeter Of Equilateral Triangle
public class q9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the side of the triangle : ");
        float a=in.nextFloat();
        System.out.println("The Perimeter of Equilateral Tringle is : "+3*a);
    }
}
