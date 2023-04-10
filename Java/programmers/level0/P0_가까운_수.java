package Algorithm.programmers.level0;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/120890
public class P0_가까운_수 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 10, 28}, 20)); // 28
        System.out.println(solution(new int[]{12, 10, 8}, 11)); // 10
        System.out.println(solution(new int[]{8, 10, 12}, 11)); // 10
    }

    static public int solution(int[] array, int n) {
        int answer = 999;
        int temp = 999;
        // 12, 10, 8 이 들어왔을 때 12와 10중 더 작은 수인 10을 반환해야 하는데 12를 반환한다.
        // 배열을 미리 정렬 시켜서 해당 문제 해결
        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {

            if(Math.abs(array[i] - n) < temp) {
                temp = Math.abs(array[i] - n);
                answer = array[i];
            }
        }

        return answer;
    }
}
