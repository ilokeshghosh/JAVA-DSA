package Practice.ConditionalLoops.Test;

import java.util.Scanner;

//Input a number and print all the factors of that number (use loops).
public class Q23 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = input.nextInt();
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.println(i);
            }

        }
    }
}
