package Practice.Array.Test;
/*
Check if the Sentence Is Pangram

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
 */
public class Q10 {
    public static void main(String[] args){
        String sentence = "thequickbrownfoxjumpsoverthelazydog";

        for(int i=0;i<sentence.length();i++){
            for (int j=0;j<sentence.length();j++){
                if(sentence.charAt(i)==sentence.charAt(j)){
                    System.out.println("False");
                    break;
                }
                else {
                    System.out.println("True");
                }
            }
        }
    }
}
