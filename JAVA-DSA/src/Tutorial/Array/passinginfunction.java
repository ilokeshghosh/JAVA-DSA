package Tutorial.Array;
import java.util.Arrays;
public class passinginfunction {
    public static void main(String[] args) {
        int[] arr={3,2,1,4};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] a){
        a[2]=99;

    }
}
