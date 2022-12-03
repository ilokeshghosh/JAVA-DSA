package Tutorial.LinearSearch;

public class intro {
    public static void main(String[] args) {
        int[] num={1,3,4,5,6,9};
        int target=5;
        System.out.println("The number "+target+" is present in :"+(search(num,target)));

    }
    static int search(int[] arr,int tar){
        if(arr.length==0){
            return -1;

        }
        for (int i=0;i<arr.length;i++){
            if(arr[i]==tar){
                return i;
            }
        }
        return  -1;
    }
}
