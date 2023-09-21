package LeetCode.Problem;
//https://leetcode.com/problems/powx-n/
public class Leet_50_Pow {
    public static void main(String[] args) {
        System.out.println(myPow(2, -3));
    }

    static public double myPow(double x, int n) {
        if(x == 1) return 1;

        double result = 1;

        if(n > 0) {
            for (int i = 0; i < n; i++) {
                result *= x;
            }
        }
        else if(n < 0) {
            for (int i = 0; i > n; i--) {
                result /= x;
            }
        }

        return result;
    }
}
