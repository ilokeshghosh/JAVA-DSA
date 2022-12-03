package Practice.ConditionalLoops.Intermidiate;
import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of the subject : ");
        int n=in.nextInt();
        System.out.println("Enter the marks of the subject : ");
        float sum=0;
        for (int i=0;i<n;i++){
            float num=in.nextInt();
            sum+=num;

        }
        System.out.println("The Average marks of the student is :"+sum/n);
    }
}
