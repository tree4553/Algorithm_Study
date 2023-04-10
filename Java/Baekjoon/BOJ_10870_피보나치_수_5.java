package Algorithm.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/10870
public class BOJ_10870_피보나치_수_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if(n == 0) {
            System.out.println(0);
            return;
        }

        int before = 0;
        int fib = 1;
        for (int i = 0; i < n - 1; i++) {
            int temp = fib;
            fib += before;
            before = temp;
        }
        System.out.println(fib);
    }
}
