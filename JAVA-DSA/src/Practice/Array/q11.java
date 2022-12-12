package Practice.Array;
import java.util.*;

/*
 Count Items Matching a Rule
 Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
Output: 1
Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].
 */
public class q11 {
    public static void main(String[] args){
//        List<List<String>> items = new ArrayList<>(3);
        List<List<String>> items = new ArrayList<>();

        List<String> child1 = new ArrayList<>();
        child1.add("phone");
        child1.add("blue");
        child1.add("pixel");
        items.add(child1);

        List<String> child2 = new ArrayList<>();
        child2.add("computer");
        child2.add("silver");
        child2.add("lenovo");
        items.add(child2);

        List<String> child3 = new ArrayList<>();
        child3.add("phone");
        child3.add("gold");
        child3.add("iphone");
        items.add(child3);


//        System.out.println(Arrays.toString(items.toArray()));
        System.out.println(countMatches(items,"type","phone"));
    }
    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count =0;
        int val=0;
        if(ruleKey.equals("type")){
            val=1;
        }
        else if (ruleKey.equals("color")){
            val=2;

        }
        else {
            val=3;
        }

        for(int i=0;i<items.size();i++){
            String[] arr= items.get(i).toArray(new String[0]);
            if(ruleValue.equals(arr[val-1])){
                count++;
            }
        }
    return count;
    }
}
