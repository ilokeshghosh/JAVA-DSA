package Practice.PlayGround;

import java.util.Scanner;

public class largestAmong3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the 1st Number :");
        int num1= sc.nextInt();
        System.out.println("Enter the 2nd Number : ");
        int num2 = sc.nextInt();
        System.out.println("Enter the 3rd Number : ");
        int num3= sc.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println(num1+" is greater among all three numbers ");

        }
        else if(num2>num1 && num2>num3){
            System.out.println(num2+" is greater among all three numbers ");

        }
        else if(num3>num1 && num3>num2){
            System.out.println(num3+" is greater among all three numbers ");

        }
    }
}
