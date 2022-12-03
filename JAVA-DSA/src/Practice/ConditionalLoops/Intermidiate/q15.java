package Practice.ConditionalLoops.Intermidiate;
import java.util.Scanner;
//Find Ncr & Npr
public class q15 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=in.nextInt();
        System.out.println("Enter the value of c");
        int r=in.nextInt();
        System.out.println("The value of "+n+"C"+r+" is "+find_nCr(n,r));
        System.out.println("The value of "+n+"P"+r+" is "+find_nPr(n,r));

    }
    static int factorial(int i){
        int fact=1;
        if(i==0 || i==1){
            return fact;
        }
        else {
            return i*factorial(i-1);
        }
    }
    static int find_nCr(int n ,int r){
        int nCr= factorial(n)/(factorial(r)*factorial(n-r));
        return nCr;
    }
    static int find_nPr(int n,int r){
        int nPr= factorial(n)/factorial(n-r);
        return nPr;
    }

}

