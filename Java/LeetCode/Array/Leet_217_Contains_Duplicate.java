package LeetCode.Array;

import java.util.Arrays;

public class Leet_217_Contains_Duplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        System.out.println(containsDuplicate(arr));
    }

    static public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i+1]) return true;
        }
        return false;
    }
}
