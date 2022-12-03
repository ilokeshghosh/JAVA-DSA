package Practice.ConditionalLoops.Test;

import java.util.Scanner;

//Take integer inputs till the user enters 0 and print the largest number from all.
public class Q25 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i=0;
        int max=0;
        int n1,n2=1;
        while(i==0){
            System.out.println("Enter the number ");
            int num= input.nextInt();
            n1=num;
            if(num==0){
                break;
            }
            if(n1>n2){
                max=n1;
            } else if(n2>n1){
                max=n2;
            }


        }
        System.out.println(max);
    }

}
