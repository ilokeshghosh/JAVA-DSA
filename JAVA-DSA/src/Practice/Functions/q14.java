package Practice.Functions;
import java.util.Scanner;
public class q14 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number ");
        int num=in.nextInt();


            System.out.println(sum(num)+" is the sum of natural number  upto "+num);

    }
    static int sum(int n){
        int sum=0;
        for (int i=1;i<=n;i++){
            sum+=i;

        }
        return sum;
    }

}
