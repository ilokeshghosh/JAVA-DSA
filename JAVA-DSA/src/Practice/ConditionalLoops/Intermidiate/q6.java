package Practice.ConditionalLoops.Intermidiate;
import java.util.Scanner;

//Calculate Commission Percentage
//commission_amount = sale price * commission_percentage / 100.
//
//commission_amount/sale price *100=  commission_percentage .
public class q6 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the commision amount");
        float a=in.nextInt();
        System.out.println("Enter the sale price :");
        float s=in.nextInt();
        float cp=(a/s)*100;
        System.out.println("The commission is : "+cp+"%");

    }
}

