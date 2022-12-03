package Tutorial.ConditionalLoops;

import java.util.Scanner;

public class calculator{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        char op;
        float ans=0;
        while(true){
            System.out.println("Enter the operator :");
            op=in.next().trim().charAt(0);
            if(op=='+'|| op=='-' || op=='*'|| op=='/' || op=='%'){
                System.out.println("Enter the 1st number :");
                float num1=in.nextFloat();
                System.out.println("Enter the 2nd number :");
                float num2=in.nextFloat();

                if(op=='+'){
                    ans=num1+num2;
                }
                if(op=='-'){
                    ans=num1-num2;
                }
                if(op=='*'){
                    ans=num1*num2;
                }
                if(op=='/'){
                    if(num2!=0) {
                        ans = num1 / num2;
                    }
                    else{
                        System.out.println(num2+" is zero ."+num2+" cannot divide by");
                        ans=0;
                    }
                }
                if(op=='%'){
                    ans=num1%num2;
                }



            }
            else if(op=='x'){
                break;
            }
            else{
                System.out.println("Invail operation !!");
            }

            System.out.println(ans);

        }
    }
}