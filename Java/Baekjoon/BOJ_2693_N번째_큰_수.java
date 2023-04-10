package Algorithm.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Collections;

// https://www.acmicpc.net/problem/2693
public class BOJ_2693_N번째_큰_수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> intArr = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 10; j++) {
                intArr.add(Integer.parseInt(st.nextToken()));
            }
            Collections.sort(intArr);
            System.out.println(intArr.get(7));
        }
    }
}
