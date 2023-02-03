package Practice.PlayGround;

import java.util.Scanner;

public class swapNum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the 1st Number : ");
        int num1=sc.nextInt();
        System.out.println("Enter the 2nd Number :");
        int num2= sc.nextInt();

        System.out.println("Before swapping : Num1 = "+num1+" and  Num2 = "+num2);

        //With using 3rd variable
        int temp = num1;
        num1=num2;
        num2=temp;
        System.out.println("After swapping : Num1 = "+num1+" and  Num2 = "+num2);


        //Without Using 3rd variable
        System.out.println("Before swapping : Num1 = "+num1+" and  Num2 = "+num2);
        num1=num2+num1;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("After swapping : Num1 = "+num1+" and  Num2 = "+num2);




    }
}
