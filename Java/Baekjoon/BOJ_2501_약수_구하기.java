package Algorithm.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/2501
public class BOJ_2501_약수_구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        ArrayList<Integer> intArr = new ArrayList<>();
        int input = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        // i를 input/2 까지만 증가시켜서 실행 횟수를 줄인다.
        for (int i = 1; i <= input / 2; i++) {
            if(input % i == 0) {
                intArr.add(i);
            }
        }

        // 자기 자신 추가
        intArr.add(input);

        // n이 약수 배열 크기보다 크면 0 반환
        if(n > intArr.size()) {
            System.out.println(0);
            return;
        }
        System.out.println(intArr.get(n - 1));
    }
}
