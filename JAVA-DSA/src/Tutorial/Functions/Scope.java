package Tutorial.Functions;

public class Scope {

    public static void main(String[] args) {
        int a=10;
        int b=20;

        {
            //this is called block scoping 
            a=78;
            int c=90;
            //values initialised in this block ,will remain in this block only
        }
        System.out.println(a); //already initialised outside the block .you can change the value
//        System.out.println(c); // This will give error .cannot use outside the block
    }
    static void random(int marks){
    int num=67;
        System.out.println(num);
        System.out.println(marks);
    }
}
