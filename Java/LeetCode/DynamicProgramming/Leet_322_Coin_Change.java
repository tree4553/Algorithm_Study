package LeetCode.DynamicProgramming;
// https://leetcode.com/problems/coin-change/
public class Leet_322_Coin_Change {
    public static void main(String[] args) {
        System.out.println(coinChange(new int[] {1,2,5}, 11));
    }

    static public int coinChange(int[] coins, int amount) {
        if(coins == null || coins.length == 0) return -1;

        if(amount <= 0) return 0;

        int[] arr = new int[amount];
        for (int i = 0; i < coins.length; i++) {
            arr[coins[i]] += 1;
        }

        return 0;
    }
}
