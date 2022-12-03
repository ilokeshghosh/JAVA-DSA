package Tutorial.Array;
import java.util.Arrays;
public class swap {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        System.out.println("Before swaping :"+Arrays.toString(arr));
        swap(arr,1,3);
        System.out.println("After swaping  :"+Arrays.toString(arr));

    }
    static void swap(int[] a,int index1,int index2){
        int temp=a[index1];
        a[index1]=a[index2];
        a[index2]=temp;




    }
}
