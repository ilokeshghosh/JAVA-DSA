package Practice.Array.Test;

import  java.util.*;

//Create Target Array in the Given Order
/*
Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
Output: [0,4,1,3,2]
Explanation:
nums       index     target
0            0        [0]
1            1        [0,1]
2            2        [0,1,2]
3            2        [0,1,3,2]
4            1        [0,4,1,3,2]


 */
public class Q9 {
    public static void main(String[] args){
        int[] nums ={0,1,2,3,4};
        int[] index={0,1,2,2,1};
//        int[] target= new int[nums.length];

        List<Integer> tmp = new ArrayList<>(nums.length);
        for(int i=0;i<index.length;i++){
           tmp.add(index[i],nums[i]);
        }

//    Process 1
//        Integer[] target = new Integer[tmp.size()];
//       target = tmp.toArray(target);

//        OR

//    Process 2
        int[] target = tmp.stream().mapToInt(i -> i).toArray();
        System.out.println(Arrays.toString(target));
    }
}
