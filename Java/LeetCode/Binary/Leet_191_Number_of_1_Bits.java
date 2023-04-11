package LeetCode.Binary;

// https://leetcode.com/problems/number-of-1-bits/
public class Leet_191_Number_of_1_Bits {
    public static void main(String[] args) {
        System.out.println(hammingWeight(0b00000000000000000000000000001011));    // 3
        System.out.println(hammingWeight(0b00000000000000000000000010000000));    // 1
        System.out.println(hammingWeight(0b11111111111111111111111111111101));    // 31
        System.out.println(hammingWeight(0b10000000000000000000000000000000));    // 1
    }
    static public int hammingWeight(int n) {
        int answer = 0;

        while(n != 0) {
            if((n & 1) == 1) {
                answer += 1;
            }
            n = n >>> 1;    // 비트열을 오른쪽으로 이동시키며, 이동에 따른 빈공간을 0으로 채운다.
        }

        return answer;
    }
}
