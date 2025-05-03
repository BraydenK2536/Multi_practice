package test.getSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        int[] nums = {-3,4,3,90};
        int target = 0;
        System.out.println(Arrays.toString(getSum(nums, target)));
    }

    public static int[] getSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if(map.containsKey(temp)) {
                return new int[]{map.get(temp), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}
