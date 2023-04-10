package Algorithm.programmers.level0;

// https://school.programmers.co.kr/learn/courses/30/lessons/120912
public class P0_7의_개수 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{7, 77, 17})); // 4
        System.out.println(solution(new int[]{10, 29}));    // 0
    }

    static public int solution(int[] array) {
        int answer = 0;

        for (int i = 0; i < array.length; i++) {
            String temp = String.valueOf(array[i]);
            for (int j = 0; j < temp.length(); j++) {
                if(temp.charAt(j) == '7') {
                    answer += 1;
                }
            }
        }

        return answer;
    }
}
