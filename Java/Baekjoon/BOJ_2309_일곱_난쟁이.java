package Algorithm.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

// https://www.acmicpc.net/problem/2309
public class BOJ_2309_일곱_난쟁이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> intArr = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            int temp = Integer.parseInt(br.readLine());
            intArr.add(temp);
            sum += temp;
        }

        for (int i = 0; i < intArr.size(); i++) {
            for (int j = 0; j < intArr.size(); j++) {
                if(i != j && sum - intArr.get(i) - intArr.get(j) == 100) {
                    intArr.set(i, 101);
                    intArr.set(j, 101);
                    Collections.sort(intArr);
                    for (int k = 0; k < 7; k++) {
                        System.out.println(intArr.get(k));
                    }
//                    System.out.println(sum);
//                    intArr.stream().forEach(System.out::println);
                    return;
                }
            }
        }
    }
}
