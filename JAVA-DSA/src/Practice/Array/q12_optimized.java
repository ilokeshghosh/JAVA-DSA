package Practice.Array;

/*

Find the Highest Altitude

Input: gain = [-5,1,5,0,-7]
Output: 1
Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
 */
public class q12_optimized {
    public static void main(String[] args){
        int[] gain = {-5,1,5,0,-5};
        System.out.println(largestAltitude(gain));
    }
    static int largestAltitude(int[] gain) {
        int current=0;
        int max=0;

        for(int i=0;i<gain.length;i++){
            current+=gain[i];
            max=Math.max(max,current);
        }
        return max;
    }
}
