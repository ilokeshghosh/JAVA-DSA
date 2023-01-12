package Practice.Array;
/*

Minimum Cost to Move Chips to The Same Position

Input: position = [1,2,3]
Output: 1
Explanation: First step: Move the chip at position 3 to position 1 with cost = 0.
Second step: Move the chip at position 2 to position 1 with cost = 1.
Total cost is 1.


 */
public class q28 {
    public static void main(String[] args) {
        //test case-1
//        int[] position = {1,2,3};

        //test case-2
        int[] position ={2,2,2,3,3};
        System.out.println(minCostToMoveChips(position));
    }
    static int minCostToMoveChips(int[] position) {

        int even=0, odd=0;
        for(int i:position){
            if(i%2==0){
                even++;
            }
            else{
                odd++;
            }
            if(even==position.length || odd==position.length) return 0;

            return Math.min(even, odd);
        }
        return 0;
    }

}
