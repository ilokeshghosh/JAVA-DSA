package Practice.Array;
/*

Find the Highest Altitude

Input: gain = [-5,1,5,0,-7]
Output: 1
Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
 */
public class q12 {
    public static void main(String[] args){
        int[] gain = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }
    static int largestAltitude(int[] gain) {
        int max=gain[0];

        for (int i=1;i<gain.length;i++){
            if(gain[i]>max){
                gain[i]=max;
            }
        }
        return max;
    }
}
