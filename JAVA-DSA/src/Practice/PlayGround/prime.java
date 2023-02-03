package Practice.PlayGround;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int num= sc.nextInt();

        int count =2;
        for(int i=2;i<num;i++){
            if(num%i==0){
                count++;
            }

        }
        if(count==2){
            System.out.println("The number "+num+" is prime");

        }else {
            System.out.println("The number "+num+" is not prime ");
        }
    }
}
