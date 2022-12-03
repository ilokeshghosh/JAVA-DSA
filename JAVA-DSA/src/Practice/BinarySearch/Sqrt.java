package Practice.BinarySearch;
public class Sqrt {
    public static void main(String[] args){
        System.out.println(search(14));

    }
    static int search(int num){
        int oddNum=1;
        int count=0;
        while (num>0){

            num=num-oddNum;
            oddNum+=2;
            if (num<0){
                return count;
            }
            else {
                count++;
            }

        }
        return count;
    }


}
