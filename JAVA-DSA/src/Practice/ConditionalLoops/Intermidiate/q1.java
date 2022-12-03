//Factorial Program In Java
package Practice.ConditionalLoops.Intermidiate;
import java.util.Scanner;


public class q1 {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number you want factorial of :");
        int n=in.nextInt();
        int fact=1;
        for (int i=0;i<=n;i++){
            if(n==0 || n==1){
                fact=fact*1;
                break;
            }
            for (int j=n;j>=2;j--){
                fact=fact*j;
                n--;
            }

        }
        System.out.println(fact);

    }
}
