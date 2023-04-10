package Algorithm.LeetCode;

public class L_121_Best_Time_To_Buy_And_Sell_Stock {

    // 시간초과!!
    // 이중 for문으로는 이 문제를 해결할 수 없엉!
    public int maxProfit1(int[] prices) {
        int answer = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if(prices[i] < prices[j]) {
                    if(answer < prices[j] - prices[i]) {
                        answer = prices[j] - prices[i];
                    }
                }
            }
        }

        return answer;
    }

    // n 복잡도로 풀어냈다!
    public int maxProfit2(int[] prices) {
        int answer = 0;
        int least = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if(prices[i] < least) {
                least = prices[i];
            }

            if(prices[i] - least > answer) {
                answer = prices[i] - least;
            }
        }

        return answer;
    }
}
