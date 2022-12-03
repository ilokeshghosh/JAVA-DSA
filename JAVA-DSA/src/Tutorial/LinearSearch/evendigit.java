package Tutorial.LinearSearch;

public class evendigit {
    public static void main(String[] args){

        int[] arr={555,556,482,1771};

        System.out.println(findNumber(arr));



    }

    public static int findNumber(int[] nums){

        int count=0;
        for(int i=0;i<nums.length;i++){

            if(check(nums[i])){
                count++;
            }


//            else if(nums[i]==0){
//                count++;
//            }
//            else if(nums[i]<0){
//                count++;
//            }



        }
        return count;
    }
    public static boolean check(int num){
        int count=0;
        while(num>0){
            count++;
            num/=10;


        }
        if (count%2==0){
            return true;
        }
        return false;


    }
}
