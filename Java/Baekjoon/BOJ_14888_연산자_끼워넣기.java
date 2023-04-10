package Algorithm.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/14888
public class BOJ_14888_연산자_끼워넣기 {
    public static int min = Integer.MAX_VALUE;
    public static int max = Integer.MIN_VALUE;
    // [0] = + , [1] = - , [2] = * , [3] = /
    static int[] operators = new int[4];
    static int[] numbers;
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        // 값들에 대한 삽입이나 삭제 동작이 없으니까, 조회에 속도가 빠른 ArrayList 대신에 배열을 쓰자
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < operators.length; i++) {
            operators[i] = Integer.parseInt(st.nextToken());
        }

        dfs(numbers[0], 1);

        System.out.println(max);
        System.out.println(min);
    }

    private static void dfs(int num, int idx) {
        if(idx == n) {
            max = Math.max(max, num);
            min = Math.min(min, num);
            return;
        }

        for (int i = 0; i < operators.length; i++) {
            if(operators[i] > 0) {
                operators[i] -= 1;

                switch(i) {
                    case 0:
                        dfs(num + numbers[idx], idx + 1);
                        break;
                    case 1:
                        dfs(num - numbers[idx], idx + 1);
                        break;
                    case 2:
                        dfs(num * numbers[idx], idx + 1);
                        break;
                    case 3:
                        dfs(num / numbers[idx], idx + 1);
                        break;
                }

                // 재귀 호출이 종료되면 다시 해당 연산자 갯수를 복구한다.
                operators[i] += 1;
            }
        }
    }
}
