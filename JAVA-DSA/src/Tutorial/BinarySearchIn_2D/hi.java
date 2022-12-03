package Tutorial.BinarySearchIn_2D;

public class hi {
    public static void main(String[] args){
        System.out.println("hi");
        int[][] arr={
                {18,9,12},
                {36,-4,91},
                {44,33,16}
        };

        int target=91;
        System.out.println(search(arr,target));



    }
    public static String search(int[][] arr, int target){
        int nrow=arr.length;
        int ncol = arr[1].length;
        for(int row=0;row<nrow;row++){
            for (int col=0;col<ncol;col++){
                if(arr[row][col]==target){
                  return "The target is found in : ROW : "+row+" And COL : "+col;

                }
            }
        }

    return "The target not found";
    }
}
