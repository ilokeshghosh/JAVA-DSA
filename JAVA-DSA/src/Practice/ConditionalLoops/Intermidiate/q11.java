package Practice.ConditionalLoops.Intermidiate;
import java.util.Scanner;
//Compound Interest Java Program
public class q11 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Principal Amount :");
        float p=in.nextFloat();
        System.out.println("Enter the rate of interest : ");
        float r=in.nextFloat();
        System.out.println("Enter the time ");
        float t=in.nextFloat();
        float ttime=t*12f;

        float a=p; //accrued amount (principle +interest);

        float R=0;


        for (int i=1;i<=ttime;i++){
            R=(a*r)/100;
            a=a+R;
        }
        System.out.println(a);

    }
}
