package Practice.Array.Test;

import java.util.Scanner;

public class t3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number to check whether");
        int num = sc.nextInt();
        int tmp=num;
        int sum=0;
        while(num>0) {
            int r = num%10;
            sum+=fact(r);
            num/=10;
        }
        if(sum==tmp) {
            System.out.println(tmp+" is strong number ");
        }
        else {
            System.out.println(tmp+" is not a strong number ");
        }
        sc.close();
    }
    static int fact(int num) {
        int mul=1;
        for(int i=1;i<=num;i++) {
            if(num==0) {
                return 0;
            }
            if(num==1) {
                mul*=1;
            }

            mul*=i;
        }
        return mul;
    }
}
