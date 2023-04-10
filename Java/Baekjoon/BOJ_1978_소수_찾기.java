package Algorithm.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/1978
public class BOJ_1978_소수_찾기 {
    public static void main(String[] args) throws IOException {
        int answer = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] intArr = new int[n];
        for (int i = 0; i < n; i++) {
            intArr[i] = Integer.parseInt(st.nextToken());
        }

        boolean isPrime = true;
        for (int i = 0; i < intArr.length; i++) {
            if(intArr[i] == 1) {
                continue;
            }

            isPrime = true;
            for (int j = 2; j < intArr[i] / 2 + 1; j++) {
                if(intArr[i] % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime == true) {
                answer += 1;
            }
        }

        System.out.println(answer);
    }
}
