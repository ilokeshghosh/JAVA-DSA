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

        String alpha = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder ans = new StringBuilder(sentence.length());
        for(int i=0;i<sentence.length();i++){
            for(int j=0;j<alpha.length();j++){
                if(sentence.charAt(i)==alpha.charAt(j)){
                    if(unik(sentence.charAt(i),ans)){
                        ans.append(sentence.charAt(i));
                    }
                }

            }
        }
        System.out.println(ans.length());
        if(ans.length()==26){
            return true;
        }
        return false;
    }
    static boolean unik(char c, StringBuilder ans){
            for(int i=0;i<ans.length();i++){
             if(ans.charAt(i)==c){
                 return false;
             }
            }
            return true;
    }



}
