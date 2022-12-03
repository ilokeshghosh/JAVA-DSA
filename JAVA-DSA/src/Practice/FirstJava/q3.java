package Practice.FirstJava;
import java.util.Scanner;

//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
public class q3 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the principle amount :");
        float principal = input.nextFloat();
        System.out.println("Enter the time :");
        float time = input.nextFloat();
        System.out.println("Enter the rate of interest :");
        float rate= input.nextFloat();
        float interest= (principal*rate*time)/100;
        System.out.println("The interest of amount "+principal+" after tenure of "+time+" is :"+interest);
        System.out.println("The total amount after tenure of "+time+" is :"+(principal+interest));

    }
}
