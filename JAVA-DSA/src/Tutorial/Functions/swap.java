package Tutorial.Functions;
public class swap {
    public static void main(String[] args) {
        int a=10;
        int b=50;
        swap(a,b);
        System.out.println(a+" "+b);

//        System.out.println(swap2(a,b));
    }
//    static int swap2(int a,int b){
//        int temp=a;
//        a=b;
//        b=temp;
//        return a;
//    }
    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;



    }
}
