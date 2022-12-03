package Practice.ConditionalLoops.Intermidiate;
import java.util.Scanner;
//HCF Of Two Numbers Program
public class q19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num1 = in.nextInt();
        System.out.println("Enter the number :");
        int num2=in.nextInt();
        int hcf=0;

        for (int i=1;i<=num1 || i<=num2 ;i++){
            if(num1%i==0 && num2%i==0){
             hcf=i;
            }
        }
            System.out.println(hcf);



        }
    }
