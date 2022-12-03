package Tutorial.Basics;

import java.util.Scanner;

public class temp_conversion {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in celcius");
        float c= input.nextFloat();
        float tempf= (c*9/5)+32;
        System.out.println("The temperature in Fahrenheit is : " +  tempf);




    }
}
