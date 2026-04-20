import java.util.*;
public class Practice {
    /**
     * Returns the difference between the largest and smallest integer in an array.
     * 
     * @param nums a non-empty, non-null array of numbers
     * @return the difference between the largest and smallest number
     */
    public static int maxDiff(int[] nums) {
        // TODO: implement this
        int max = nums[0];
        int min = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max) max = nums[i];
            if(nums[i] < min) min = nums[i];
        }
        return max - min;
    }


    // TODO: Implement the other methods from the README AND tests for each one

    // For each method you are only required to implement it for one of the data
    // structures. But use a different data structure for each method. For example,
    // do maxDiff with an array, the next question with a Set, etc.

    public static String longestStartsWith(Set<String> words, char start){
        String result = "";
        for(String word : words){
            if(word.toLowerCase().charAt(0) == start && word.length() > result.length()) result = word;
        }
        return result;
    }

    public static int longerAndShorter(int n, int m, List<String> words){
        int result = 0;
            for(String word : words){
                if(word.length() > n && word.length() < m) result++;
            }
        return result;
    }

    public static int diffOddEven(Map<Integer, Integer> nums){
        int odd = 0;
        int even = 0;
        for(int num : nums.values()){
            if(num % 2 == 0) even++;
            else odd++;
        }
        return odd - even;
    }
}
