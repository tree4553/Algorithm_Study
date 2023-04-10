package Algorithm.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/3460
public class BOJ_3460_이진수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        // n번 실행
        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(br.readLine());
            int j = 0;
            // input이 1이 될때까지 실행
            while(input != 1) {
                // 2로 나눈 나머지가 1이면 j를 sb에 추가
                if(input % 2 == 1) {
                    sb.append(j+" ");
                }
                input /= 2;
                j += 1;
            }
            sb.append(j);
            System.out.println(sb.toString());
            sb.setLength(0);

        }
    }
}
