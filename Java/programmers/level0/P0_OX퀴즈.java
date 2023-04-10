package Algorithm.programmers.level0;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/120907
public class P0_OX퀴즈 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"3 - 4 = -3", "5 + 6 = 11"})));    // ["X", "O"]
        System.out.println(Arrays.toString(solution(new String[]{"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"})));  // ["O", "O", "X", "O"]
    }

    static public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            String[] stringArr = quiz[i].split(" ");
            int a = Integer.parseInt(stringArr[0]);
            int b = Integer.parseInt(stringArr[2]);
            int c = Integer.parseInt(stringArr[4]);

            if(stringArr[1].equals("+")) {
                if(a + b == c) {
                    answer[i] = "O";
                }
                else {
                    answer[i] = "X";
                }
            }
            else {
                if(a - b == c) {
                    answer[i] = "O";
                }
                else {
                    answer[i] = "X";
                }
            }
        }
        return answer;
    }
}
