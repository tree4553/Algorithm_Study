package LeetCode.DynamicProgramming;

import java.util.Arrays;

// https://leetcode.com/problems/coin-change/
public class Leet_322_Coin_Change {
    public static void main(String[] args) {
        System.out.println(coinChange(new int[] {1,2,5}, 11));
    }

    static public int coinChange(int[] coins, int amount) {
        if(coins == null || coins.length == 0) return -1;

        if(amount <= 0) return 0;

        int[] arr = new int[amount + 1];
        Arrays.fill(arr, amount + 1);
        arr[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for(int coin : coins) {
                if(i >= coin) {
                    arr[i] = Math.min(arr[i], arr[i - coin] + 1);
                }
            }
        }

        int answer = -1;
        //arr[amount]
        return 0;
    }
}
