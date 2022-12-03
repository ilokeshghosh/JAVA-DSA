package Practice.Functions;
import java.util.Scanner;
//Write a program that will ask the user to enter
//his/her marks(out of 100).Define a method that will
//display grades according to the marks entered as below:
public class q8 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);


            System.out.println("Enter the number(out of 100) :");
            float mark = in.nextFloat();
            grade(mark);



    }
    static void grade(float marks){

    if (marks > 90 && marks <= 100) {
        System.out.println("Grade : AA");
    } else if (marks > 80 && marks <= 90) {
        System.out.println("Grade : AB");
    } else if (marks > 70 && marks <= 80) {
        System.out.println("Grade : BB");

    } else if (marks > 60 && marks <= 70) {
        System.out.println("Grade : BC");
    } else if (marks > 50 && marks <= 60) {
        System.out.println("Grade : CD");
    } else if (marks > 41 && marks <= 50) {
        System.out.println("Grade : DD");
    } else if (marks <= 40) {
        System.out.println("Grades : Fail");

    }



    }
}
