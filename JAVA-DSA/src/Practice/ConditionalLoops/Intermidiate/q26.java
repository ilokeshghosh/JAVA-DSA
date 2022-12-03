package Practice.ConditionalLoops.Intermidiate;
import java.util.Scanner;

//Write a program to print the sum of negative numbers,
// sum of positive even numbers and the sum of positive
// odd numbers from a list of numbers (N) entered by the user.
// The list terminates when the user enters a zero.

public class q26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[20];
        int negnum = 0;
        int pen = 0;
        int pon = 0;
        int count = 0;
        while (true) {
            System.out.println("Enter the number");
            arr[count] = in.nextInt();
            if(arr[count]==0){
                break;
            }
            count++;
        }

        for(int i=0;i<count;i++){
            if(arr[i]<0){
                negnum+= arr[i];

            } else if (arr[i] > 0) {
                if(arr[i]%2==0) {
                    pen += arr[i];
                }
                else  {
                    pon+=arr[i];
                }
            }
        }
        System.out.println("The sum of negetive number is : "+negnum);
        System.out.println("The sum of positive even number is : "+pen);
        System.out.println("The sum of positive odd number is :"+pon);


    }

}