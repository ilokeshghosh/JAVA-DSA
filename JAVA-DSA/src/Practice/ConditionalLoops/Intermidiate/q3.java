//Calculate Average Of N Numbers
package Practice.ConditionalLoops.Intermidiate;
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number of element : ");
        int n=in.nextInt();

        int sum=0;
        int count=1;
        for(int i=1;i<=n;i++){
            System.out.println("Enter the "+count+" element :" );
            int num=in.nextInt();
            sum+=num;
            count++;
        }
        int av=sum/n;
        System.out.println("The average of the number is :"+av);

    }
}
