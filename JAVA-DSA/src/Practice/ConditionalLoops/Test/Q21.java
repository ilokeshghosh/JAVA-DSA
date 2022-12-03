package Practice.ConditionalLoops.Test;

import java.util.Scanner;

//Fibonacci Series in java programs
public class Q21 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);

        System.out.println("Enter the number you want fibonacci series of : ");
        int num= input.nextInt();
        int[] series= new int[num+1];
        int sum=0;
        int firstTerm=0;
        int secondTerm=1;

        series[0]=firstTerm;
        series[1]=secondTerm;


        for(int i=1;i<num;i++){
           sum=firstTerm+secondTerm;
           firstTerm = secondTerm;
           secondTerm=sum;
           series[i+1]=sum;

        }
        for(int i=0;i<=num;i++){
            System.out.println(series[i]);
        }
    }
}
