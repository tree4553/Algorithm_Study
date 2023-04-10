package Algorithm.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/1292
public class BOJ_1292_쉽게_푸는_문제 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        ArrayList<Integer> intArr = new ArrayList<>();
        for (int i = 1; i <= end; i++) {
            for (int j = 0; j < i; j++) {
                intArr.add(i);
                if(intArr.size() == end) {
                    int sum = 0;
                    for (int k = start; k <= end; k++) {
                        sum += intArr.get(k - 1);
                    }
                    System.out.println(sum);
//                    System.out.println(intArr.toString());
                    return;
                }
            }
        }
    }
}
