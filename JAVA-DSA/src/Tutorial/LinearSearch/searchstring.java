package Tutorial.LinearSearch;
import java.util.Arrays;
public class searchstring {
    public static void main(String[] args) {
        String name="Lokesh";
        char tar='k';
//        System.out.println(search2(name,tar));

        System.out.println(Arrays.toString(name.toCharArray()));
    }

    static boolean search2(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(char ch:str.toCharArray()){
            if(target==ch){
                return true;
            }
        }
        return false;
    }

//    static boolean search(String str,char target){
//        if(str.length()==0){
//            return false;
//        }
//        for(int i=0;i<str.length();i++){
//            if(target==str.charAt(i)){
//                return true;
//            }
//        }
//        return false;
//    }
}
