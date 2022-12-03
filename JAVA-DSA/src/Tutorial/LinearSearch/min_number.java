package Tutorial.LinearSearch;

public class min_number {
    public static void main(String[] args){
        int[] arr= {18,12,7,3,14,28};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int min=arr[0];
        for (int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
}
