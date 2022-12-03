package Practice.ConditionalLoops.Intermidiate;
import java.util.Scanner;
import java.util.Arrays;
//Reverse A String In Java
public class q16 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the String :");
        String st=in.nextLine();
        char ch;
        String nst="";
        System.out.println(st);
//        System.out.println();
        for (int i=0;i<st.length();i++)
        {
            ch=st.charAt(i);
           nst =ch+nst;

        }
        System.out.println(nst);


    }
}

