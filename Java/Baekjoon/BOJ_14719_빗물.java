package Algorithm.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/14719
public class BOJ_14719_빗물 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");

        int height = Integer.parseInt(st1.nextToken());
        int width = Integer.parseInt(st1.nextToken());

        int[] arrInput = new int[width];
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < width; i++) {
            arrInput[i] = Integer.parseInt(st2.nextToken());
        }

        // 2차원 배열로 블록들을 만들자.
        int[][] arrBlock = new int[height][width];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < arrInput[i]; j++) {
                arrBlock[j][i] = 1;
            }
        }

        printArr(arrBlock);

        int answer = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (arrBlock[i][j] == 1) {
                    int k = j + 1;
                    int water = 0;

                    while (true) {
                        if (k == width) break;
                        if (arrBlock[i][k] == 1) break;
                        water += 1;
                        k += 1;
                    }

                    if(k == width) {
                        if(arrBlock[i][k-1] == 1) {
                            answer += water;
                        }
                        continue;
                    }

                    if (arrBlock[i][k] == 1) {
                        answer += water;
                        continue;
                    }
                }
            }
        }
        System.out.println(answer);
    }

    static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
