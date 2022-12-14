package Practice.Array.Test;
import java.util.*;
public class t2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the priciple amount :");
        float p= sc.nextFloat();
        System.out.println("Enter the rate :");
        float r= sc.nextFloat();
        System.out.println("Enter the time :");
        float t= sc.nextFloat();
        float si= (p*t*r)/100;
        System.out.println("The simple interest :"+si);
        System.out.println("The total amount is :"+(si+p));

    }
}
