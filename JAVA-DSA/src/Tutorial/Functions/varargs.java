package Tutorial.Functions;
import java.util.Arrays;

public class varargs {
    public static void main(String[] args) {
//        fun(2,3,4,5,23,42,55,94);//internally stores in an array
        multiple(50,30,"Lokesh","Raja","Ram");
        mulint(50,30,80,60,400);

    }
    static void multiple(int a,int b,String ...s){ // variable length argument at the end .
        System.out.println(a+" "+b+" "+Arrays.toString(s));
//        System.out.println(Arrays.toString(s));
    }
    static void mulint(int a,int b,int ...s){
        System.out.println(a+" "+b+" "+Arrays.toString(s));

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

}
