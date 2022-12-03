package Practice.ConditionalLoops.Intermidiate;
import java.util.Scanner;

public class q24 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number ");
        int num= in.nextInt();
        int sum=0;

        while(num!=0){
            int r=num%10;
            sum+=r;
            num/=10;

        }
        System.out.println("The sum of the digit is : "+sum);
    }
}
