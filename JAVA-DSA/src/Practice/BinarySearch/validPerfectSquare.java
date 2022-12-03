package Practice.BinarySearch;
public class validPerfectSquare {
    public static void main(String[] args){
        int num=808201;
        System.out.println(isPerfectSquare(num));

    }
    static boolean isPerfectSquare(int num) {
       long start=1;
       long end=num/2;
       if(num==1){
            return true;
       }
       while(start<=end){
           long mid=start+(end-start)/2;

           if(num==(mid*mid)){
               return true;
           }
           if (num>(mid*mid)){
               start=mid+1;
           }

           else{
               end=mid-1;
           }
       }
       return false;

    }
}
