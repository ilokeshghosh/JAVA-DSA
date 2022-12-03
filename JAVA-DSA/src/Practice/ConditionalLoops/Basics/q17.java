package Practice.ConditionalLoops.Basics;
import java.util.Scanner;

//Volume Of Sphere
public class q17 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the radius of the : ");
        float r=in.nextFloat();
        float pi=3.1415f;
        float v=1.3333f*pi*(r*r*r);
        System.out.println("The volume of the sphere is : "+v);


    }
}
