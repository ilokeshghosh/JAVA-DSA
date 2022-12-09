package Practice.Array.Test;

import java.util.ArrayList;
import java.util.List;

/*

Check if the Sentence Is Pangram

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.




ascii value from a to z is 97 to 122;
 */
public class Q10 {
    public static void main(String[] args){
        String sentence = "leetcode";
//        String sentence= "thequickbrownfoxjumpsoverthelazydog";



        System.out.println(checkIfPangram(sentence));
    }

    static boolean checkIfPangram(String sentence) {
//        int count=0;
       StringBuilder al = new StringBuilder(sentence.length()+1);
        for (int i=0;i<sentence.length();i++){
            if(unik(al,sentence.charAt(i))){
                al.insert(i,sentence.charAt(i));
            }
        }
        if(al.length()==25){
            return true;
        }
        return false;


    }
    static boolean unik(StringBuilder sentence,char ch){

        for (int i=0;i<sentence.length();i++){
            if(ch==sentence.charAt(i)){
                return false;
            }
        }
        return true;
    }


}
