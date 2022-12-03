package Practice.BinarySearch;
public class ArrangingCoins {
    public static void main(String[] args){
        int n=5;
        System.out.println(arrangeCoins(n));

    }
    static int arrangeCoins(int n) {
        int start=1;
        int end=0;
        int count=0;
        while(n>=0){
            end=setRange(n,end);
            n=n-end;
            count++;


        }
        return count;
    }
    static int setRange(int n,int end){
//        int start=1;
//        int end=2;
        int range=1;
        while(end<=n){
            if(end==0){
                return range;
            }
            range+=1;
            end++;
            n--;
        }
        return range;

    }
}
