package Algorithm.programmers.level0;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/120923
public class P0_연속된_수의_합 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, 12)));    //  [3, 4, 5]
        System.out.println(Arrays.toString(solution(4, 14)));    // [2, 3, 4, 5]
        System.out.println(Arrays.toString(solution(5, 5)));    // [-1, 0, 1, 2, 3]
    }

    static public int[] solution(int num, int total) {
        int[] answer = new int[num];

        // total을 num으로 나눠서 중앙값을 구한 후
        int middleValue = total / num;
        int middleIndex = num / 2;

        // 나머지가 0이라면 배열 가운데 middle을 넣고 좌우 값들을 배열에 넣어준다.
        if(total % num == 0) {
            for (int i = 0; i < num; i++) {
                answer[i] = middleValue + i - middleIndex;
            }
        } else {
            for (int i = 0; i < num; i++) {
                answer[i] = middleValue + i - middleIndex + 1;
            }
        }
        return answer;
    }
}
