package Practice.Array.Test;

public class Q10_optimized {
    public static void main(String[] args){
//        String sentence = "leetcode";
        String sentence= "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }
    static boolean checkIfPangram(String sentence) {
        for(int i=0;i<26;i++){
            int temp =97+i; //'a' = 97;
            if(sentence.indexOf(temp)==-1){
                return false;
            }
        }
        return true;
    }
}
