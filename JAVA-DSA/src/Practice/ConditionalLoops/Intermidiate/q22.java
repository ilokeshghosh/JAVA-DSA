package Practice.ConditionalLoops.Intermidiate;
import java.util.Scanner;
//Perfect Number In Java
public class q22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num= in.nextInt();
//        int div=1;
        int sum=0;

        for(int i=1;i<=num/2;i++){
            if(num%i==0){
//                System.out.println(i);
                sum+=i;
            }
        }
        if (sum==num){
            System.out.println("The number is a perfect number :");
        }
    }
}
