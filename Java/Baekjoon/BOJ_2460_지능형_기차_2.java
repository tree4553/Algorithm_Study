package Algorithm.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/2460
public class BOJ_2460_지능형_기차_2 {
    public static void main(String[] args) throws IOException {
        int total = 0;
        int max = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int out = 0;
            int in = 0;
            out = Integer.parseInt(st.nextToken());
            in = Integer.parseInt(st.nextToken());
            total += in - out;
            if(total > max) {
                max = total;
            }
        }
        System.out.println(max);
    }
}
