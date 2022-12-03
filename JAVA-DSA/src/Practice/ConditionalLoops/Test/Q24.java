package Practice.ConditionalLoops.Test;

import java.util.Scanner;

public class Q24 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i=0;
        int sum=0;
        while(i==0){
           System.out.println("Enter the number ");
           int num= input.nextInt();
           if(num==0){
               break;
           }
           sum+=num;

        }
        System.out.println(sum);
    }
}
