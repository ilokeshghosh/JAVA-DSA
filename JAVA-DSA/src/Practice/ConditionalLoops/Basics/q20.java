package Practice.ConditionalLoops.Basics;
import java.util.Scanner;

//Total Surface Area Of Cube
public class q20 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the side of the cube : ");
        float s=in.nextInt();
        float v=6*(s*s);
        System.out.println("The surface area of the cube is  : "+v);
    }
}
