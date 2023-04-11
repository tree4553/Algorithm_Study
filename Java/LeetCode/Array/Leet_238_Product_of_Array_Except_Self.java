package LeetCode.Array;

import java.util.Arrays;

public class Leet_238_Product_of_Array_Except_Self {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
        System.out.println();
        int[] nums2 = {-1, 1, 0, -3, 3};
        System.out.println(Arrays.toString(productExceptSelf(nums2)));
    }

    static public int[] productExceptSelf(int[] nums) {
        // O(n) 복잡도로 풀어내라고?
        // 나누기 연산자를 쓰지 말라고? 또잉?

        // 아몰랑 이중포문
        int[] answer = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            answer[i] = 1;
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    answer[i] *= nums[j];
                }
            }
        }

        return answer;
    }

    static public int[] productExceptSelfSolution(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        Arrays.fill(ans, 1);
        int curr = 1;
        for (int i = 0; i < n; i++) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        curr = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        return ans;
    }
}
