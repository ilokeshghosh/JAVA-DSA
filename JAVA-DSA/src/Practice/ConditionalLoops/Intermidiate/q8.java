package Practice.ConditionalLoops.Intermidiate;
import java.util.Scanner;

//Calculate Depreciation of Value
public class q8 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
//        System.out.println("Enter the Cost of an Asset :");
//        float c=in.nextFloat();
//        System.out.println("Residual value :");
//        float r=in.nextFloat();
//        System.out.println("Useful life of asset :");
//        float u=in.nextFloat();
//        float d=(c-r)/u;
//        System.out.println("The depreciation of value is "+d);

        System.out.println("Enter the Cost of an Asset :");
        float c=in.nextFloat();
        System.out.println("Enter the percentage of depreciation");
        float p=in.nextFloat();
        System.out.println("Useful life of asset :");
        float u=in.nextFloat();
        System.out.println("We will take depreciation as constant ");
        float ac=c;
        int count=1;


        for(int i=0;i<u;i++){
            float val;
            val=(c*p)/100;
            ac=ac-val;
            System.out.println("Value depreciated to "+ac+" in "+count+" year");
            count++;

        }
    }
}
