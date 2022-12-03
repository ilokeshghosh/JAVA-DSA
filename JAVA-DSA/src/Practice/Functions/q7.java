package Practice.Functions;
import java.util.Scanner;
//Define a method to find out if a number is prime or not
public class q7 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number :");
        int num=in.nextInt();

        if(prime(num)){
            System.out.println("The entered number is  prime ");
        }
        else{
            System.out.println("The entered number is not prime");
        }
    }
    static boolean prime(int n){

        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }




        }
         if(n==1){
            return false;
        }
        return true;
    }

}
