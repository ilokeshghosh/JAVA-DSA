package Practice.Functions;
import java.util.Scanner;
//Write a function to check if a given triplet is a Pythagorean
//triplet or not.(A Pythagorean triplet is when the sum of
//the square of two numbers is equal o the square of the third numbers)


public class q12 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the 1st number :");
        float num1=in.nextInt();
        System.out.println("Enter the 2nd number :");
        float num2=in.nextInt();
        System.out.println("Enter the 3rd number :");
        float num3=in.nextInt();
        pyth(num1,num2,num3);


    }
    static void pyth(float a,float b,float c){
//        a^2=b^2+c^2;

        float max=Math.max(a,Math.max(b,c));
        System.out.println(max);
        float sqmax= (float)(Math.pow(max,2));
        System.out.println(sqmax);


        float min1=Math.min(a,Math.min(b,c));
        System.out.println(min1);
        float sqmin1=(float)(Math.pow(min1,2));
        System.out.println(sqmin1);

//        float min2=0;
//        if(a>=min2||b>=min2||c>=min2 && a%3==0 || b%3==0 || c%3==0){
//            min2=
//        }
//        if(){
//            System.out.println("The given numbers forms Pythagorean triplet ");
//        }
//        else {
//            System.out.println("The given number is not Pythagorean triplet");
//        }
    }
}
