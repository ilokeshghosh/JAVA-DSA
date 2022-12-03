package Practice.ConditionalLoops.Intermidiate;
import java.util.Scanner;
public class q20 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two number :");
        int num1=in.nextInt();
        int num2=in.nextInt();
        int lcm=0;
        int hcf=0;
        for (int i=1;i<=num1 || i<=num2;i++){
            if(num1%i==0 && num2%i==0){

                hcf=i;

            }
        }
     lcm=(num1*num2)/hcf;
        System.out.println(lcm);
    }
}
