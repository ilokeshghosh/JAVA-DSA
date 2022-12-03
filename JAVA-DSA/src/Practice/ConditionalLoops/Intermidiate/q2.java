//Calculate Electricity Bill
//reference link : https://www.electrical4u.net/calculator/west-bengal-electricity-bill-calculator-tariff-for-per-unit-calculation/
package Practice.ConditionalLoops.Intermidiate;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the unit consumed :");
        float u=in.nextFloat();
        int f=15;//fixed charge is 15;
        float n=1.0f;
        float a = 0.0f;
        while (n<=u) {

            if (n >= 0 && n <=102) {
                 a += 102 * 5.37f;
                n=n+102;


            }
            else if (n >= 103 && n <= 180) {
                a+= 78 * 5.97f;
                n=n+78;


            }
            else if (n >= 181 && n <=300) {
                 a += 120 * 6.97f;
                n=n+120;


            }
            else if (n >= 301 && n <= 600) {
                            a += 300 * 7.31f;
                n=n+300;


            }
            else if (n >=601 && n <= 900) {
                            a+= 300 * 7.58f;
                n=n+300;


            }
             else if (n >=901) {

                 a +=(u-900)* 8.99f;
//                System.out.println(u-n);
//                System.out.println(n);
                n=n+(u-900);


            }


        }
        System.out.println("Total Energy charges : "+a);
        System.out.println("Fixed Charges : "+15);
        System.out.println("Total Bill Amount : "+(a+15));


    }
}
