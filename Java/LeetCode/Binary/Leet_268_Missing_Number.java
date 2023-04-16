package LeetCode.Binary;

// https://leetcode.com/problems/missing-number/
public class Leet_268_Missing_Number {
    public int missingNumber(int[] nums) {
        boolean[] arr = new boolean[nums.length + 1];
        for(int i = 0 ; i < nums.length; i++) {
            arr[nums[i]] = true;
        }

        for(int i = 0 ; i < arr.length; i++ ) {
            if(arr[i] == false) {
                return i;
            }
        }
        return 0;
    }

    public int missingNumberSolution(int[] nums) {
        int sum = 0;
        for(int num: nums)
            sum += num;

        return (nums.length * (nums.length + 1) )/ 2 - sum;
    }
}
