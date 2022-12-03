package Tutorial.Basics;

import java.util.Scanner;

public class sum {
    public static void main(String[] args){
        System.out.println("Enter two numbers :");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("The summation of to given number is : " + sum);
    }
}
