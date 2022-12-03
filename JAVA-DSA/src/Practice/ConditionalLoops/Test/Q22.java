package Practice.ConditionalLoops.Test;

import java.util.Scanner;

public class Q22 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num=input.nextInt();
        int sum=0;
        int pro=1;
        while(0<num){
            int r=num%10;
            num=num/10;
            sum=sum+r;
            pro=pro*r;

        }
        System.out.println("The answer is : "+(pro-sum));
    }
}
