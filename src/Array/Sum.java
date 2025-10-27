package Array;

import java.util.Arrays;
import java.util.HashMap;

public class Sum {

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer ComplementsIndex = map.get(nums[i]);
            if(ComplementsIndex != null){
                return new int[]{ComplementsIndex, i};
            }else{
                map.put(target - nums[i], i );
            }

        }
        return nums;
    }


    public static void main(String[] args) {
        int[] ans = {5,2,4};
        int target = 6;
        int[] result = twoSum(ans,target);
        System.out.println(Arrays.toString(result));
    }
}
