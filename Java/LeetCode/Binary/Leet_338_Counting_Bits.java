package LeetCode.Binary;

// https://leetcode.com/problems/counting-bits/
public class Leet_338_Counting_Bits {
    public int[] countBits(int n) {
        int[] answer = new int[n+1];

        for (int i = 0; i < answer.length; i++) {
            int num = i;
            int count = 0;

            while(num != 0) {
                if((num & 1) == 1) {
                    count += 1;
                }
                num >>= 1;
            }

            answer[i] = count;
        }

        return answer;
    }
}
