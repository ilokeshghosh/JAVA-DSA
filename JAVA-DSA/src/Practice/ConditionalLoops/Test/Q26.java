package Practice.ConditionalLoops.Test;

import java.util.Scanner;

//Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
public class Q26 {
    public static void main(String[] args){
        int nsum=0;
        int psum=0;
        int posum=0;
        int i=1;
        Scanner input= new Scanner(System.in);
        while(true){
            System.out.println("Enter "+i+" number :");
            i++;
            int num= input.nextInt();
            if(num==0){
                break;
            }
            if(num%2!=0 && num>0){

                posum+=num;
            }
            if(num>0) {
                psum+=num;
            }
            if(num<0){
                nsum+=num;
            }

        }
        System.out.println("The sum negative numbers are: "+nsum);
        System.out.println("The sum of positive numbers are :"+psum);
        System.out.println("The sum of positive odd number is :"+posum);


    }
}
