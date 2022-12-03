package Tutorial.BinarySearch;

public class smallest_letter {
    public static void main(String[] args){

        char[] letter={'c','f','j'};
        char target='g';
        System.out.println("The letter is "+nextGreatestLetter(letter,target));

    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;

        while(start<=end){

            int mid=start+(end-start)/2;
            if(target<letters[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }

        }
        return letters[start% letters.length];

    }


}
