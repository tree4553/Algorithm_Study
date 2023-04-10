package Algorithm.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

// https://www.acmicpc.net/problem/2581
public class BOJ_2581_소수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> intArr = new ArrayList<>();
        boolean isPrime = true;
        for (int i = M; i <= N; i++) {
            // 1은 소수가 아니다!!
            if(i == 1) {
                continue;
            }

            isPrime = true;
            for (int j = 2; j < i / 2 + 1; j++) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime == true) {
                intArr.add(i);
            }
        }

        if(intArr.size() == 0) {
            System.out.println(-1);
            return;
        }

        System.out.println(intArr.stream().mapToInt(s -> s).sum());
        System.out.println(intArr.get(0));
//        intArr.stream().forEach(System.out::println);

        // chatGPT가 풀어준 코드
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int M = Integer.parseInt(br.readLine());
//        int N = Integer.parseInt(br.readLine());
//
//        // 에라토스테네스의 체 알고리즘을 사용하여 소수 구하기
//        boolean[] isPrime = new boolean[N + 1];
//        Arrays.fill(isPrime, true);
//        isPrime[0] = isPrime[1] = false;
//        for (int i = 2; i * i <= N; i++) {
//            if (isPrime[i]) {
//                for (int j = i * i; j <= N; j += i) {
//                    isPrime[j] = false;
//                }
//            }
//        }
//
//        ArrayList<Integer> intArr = new ArrayList<>();
//        for (int i = M; i <= N; i++) {
//            if (isPrime[i]) {
//                intArr.add(i);
//            }
//        }
//
//        if (intArr.size() == 0) {
//            System.out.println(-1);
//            return;
//        }
//
//        System.out.println(intArr.stream().mapToInt(s -> s).sum());
//        System.out.println(intArr.get(0));
//        intArr.stream().forEach(System.out::println);
    }
}
