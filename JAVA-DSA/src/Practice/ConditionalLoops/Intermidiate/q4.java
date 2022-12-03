package Practice.ConditionalLoops.Intermidiate;
import java.util.Scanner;

//Calculate Discount Of Product
public class q4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the original price($) of the product : ");
        float p=in.nextFloat();
        System.out.print("Enter the % of discount of the particular product : ");
        float d=in.nextFloat();
        float dp=p-(p*d/100);
        System.out.println("The original amount the product is : $"+p);
        System.out.println("With "+d+"% discount.The product price is : $"+dp);
    }
}
