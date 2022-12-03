package Practice.BinarySearch;
public class Guess_number_higher_or_lower {
    public static void main(String[] args){
        int left=1;
        int right=10;
        while (left<=right){
            int mid=left+(right-left)/2;
            int g=guess(mid,right);
            if (g==0){
                System.out.println(mid);
//                return mid;
            }
            if(g==1){
                left=mid+1;
            }
          else {
                right=mid-1;
            }


        }

    }
    static int guess(int mid, int right){
        if(mid==right){
            return 0;
        }
        if (mid<right){
           return  1;
        }
        else {
            return -1;
        }
    }








}
