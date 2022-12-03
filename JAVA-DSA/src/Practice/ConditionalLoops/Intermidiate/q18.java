package Practice.ConditionalLoops.Intermidiate;
import java.util.Scanner;
//Future Investment Value
public class q18 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the value Present value : ");
        float pv=in.nextFloat();
        System.out.println("Enter the rate of interest ");
        float r=in.nextFloat();
        System.out.println("Enter the number of period ");
        float t=in.nextFloat();
        double fv=0;


            fv = pv * Math.pow((1 + r/100),t);

        System.out.println(fv);
    }
}
