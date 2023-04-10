package Algorithm.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/2609
public class BOJ_2609_최대공약수와_최소공배수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int leastCommonMultiple = 1;
        int greatestCommonDivisor = 0;
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        // b에 더 큰 수를 둔다.
        if (a > b) {
            int temp = b;
            b = a;
            a = temp;
        }

        // b를 a로 나눌수 있을때
        if(b % a == 0) {
            System.out.println(a);
            System.out.println(b);
            return;
        }

        // a를 2로 나눈 수부터 공통으로 나눌 수 있는지 확인한다.
        for (int i = a / 2 + 1; i > 1; i--) {
            if(a % i == 0 && b % i == 0) {
                leastCommonMultiple = i;
                break;
            }
        }

        System.out.println(leastCommonMultiple);
        System.out.println(a * b / leastCommonMultiple);
    }
}
