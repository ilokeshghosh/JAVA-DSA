//import java.util.Collections;
//import java.util.Scanner;
package Practice.FirstJava;
import java.util.Scanner;




//To find out whether the given String is Palindrome or not.
public class q8 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);

        System.out.println("Enter the String");
        String str=input.nextLine();
        String rev="";
        for(int i= str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        if (str.equals(rev)){
            System.out.println("The String "+str+" is palindrome");

        }
        else{
            System.out.println("The string "+str+" is not palindrome");
        }

//



    }
}
