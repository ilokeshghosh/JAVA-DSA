package Practice.Array;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.lang.String;
import java.util.Arrays;
import java.util.List;

public class q9 {
    public static void main(String[] args){
        int[] nums= {1,2,3,4,0};
        int[] index= {0,1,2,3,0};


      List<Integer> target= new ArrayList<>(nums.length);
      int j=0;
        for (int i=0;i<index.length;i++){



                target.add(index[j],nums[i]);
                j++;


        }

//        int[] array=target.toArray(new int[nums.length]);
//        for (int i=0;i<index.length;i++){
//            System.out.println(target.get(i));
//        }






//        for (int i:target){
//            System.out.println(i);
//        }
//
//        System.out.println(target.size());
    }
}
