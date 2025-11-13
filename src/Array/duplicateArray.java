package Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class duplicateArray {
    public static boolean containsDuplicate(int[] nums) {

        // Approach 1: using sort

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {

            if(nums[i] == nums[i + 1]){
                return true;
            }

        }
        return false;
    }


    // Approach 2: using HashSet, via storing

    HashSet<Integer> numbers = new HashSet<>();
        for (int num : nums) {
        if (numbers.contains(num)) return true;
        numbers.add(num);
    }
        return false;

    public static void main(String[] args) {
        int[] nums = {2, 1,2,3,4};
        System.out.println(containsDuplicate(nums));
    }
}