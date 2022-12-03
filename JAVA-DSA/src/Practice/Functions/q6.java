package Practice.Functions;
import java.util.Scanner;

public class q6 {
    static float pi=3.1415f;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the radius : ");
        float r= in.nextFloat();
        System.out.println("The circumference is : "+cir(r));
        System.out.println("The area is :"+ar(r));
    }
    static float cir(float rad){
        return 2*pi*rad;

    }
    static float ar(float rad){
//        float ar=pi*Math.pow(rad,2);
        return (float)(pi*Math.pow(rad,2));
    }
}
