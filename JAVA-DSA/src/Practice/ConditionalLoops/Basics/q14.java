package Practice.ConditionalLoops.Basics;
import java.util.Scanner;

//Volume Of Cone Java Program
public class q14 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        float pi=3.1415f;
        System.out.println("Enter the height of the cone :");
        float h=in.nextFloat();
        System.out.println("Enter the radius of the cone :");
        float r=in.nextFloat();
        float p= 0.3333f*pi*(r*r)*h;
        System.out.println("The volume of the cone is :"+p);
    }
}
