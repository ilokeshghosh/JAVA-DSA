package Practice.Array;
import java.lang.String;
import java.util.Collection;
import java.util.Set;
import java.util.HashSet;

public class q10 {
    public static void main(String[] args){
        String sentence="hxsdz";
        boolean check=false;

//
//        for(int i=0;i<sentence.length();i++){
//
//            for (int j=97;j<=122;j++){
//                if (j==sentence.charAt(i)){
//                    check=true;
//                    break;
//                }
//                else {
//                    check=false;
//                }
//            }
//        }
//
//        System.out.println(check);

        Set<Character> set = new HashSet<>();
        for(int i = 0; i < sentence.length(); i++) {
            set.add(sentence.charAt(i));
        }
//        return set.size() == 26;
    }
}
