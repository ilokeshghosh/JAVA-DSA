package Tutorial.Functions;
import java.util.Arrays;
public class method_overloading {
    public static void main(String[] args) {
    fun(2); //function overloading done is compile time and function over-riding is done in run time
    fun("Lokesh");
    fun(4,5,6);
    demo(5,3,4,7);
    demo("Lokesh","Ram","Raj");
//    demo();//this will throw a error(it is ambiguity)
    }
    static void fun(int a){
        System.out.println(a);

    }
    static void fun(String name){
        System.out.println(name);
    }
    static void fun(int a,int b,int c){
        System.out.println(a+b+c);
    }
    static void demo(int ...a){
        System.out.println(Arrays.toString(a));
//        System.out.println(a);
    }
    static void demo(String ...a){
        System.out.println(Arrays.toString(a));
    }
}
