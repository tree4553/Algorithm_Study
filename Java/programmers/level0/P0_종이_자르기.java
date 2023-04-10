package Algorithm.programmers.level0;

// https://school.programmers.co.kr/learn/courses/30/lessons/120922
public class P0_종이_자르기 {
    public static void main(String[] args) {
        System.out.println(solution(2, 2)); // 3
        System.out.println(solution(2, 5)); // 9
        System.out.println(solution(1, 1)); // 0
    }

    static public int solution(int M, int N) {
        int answer = M * N - 1;
        return answer;
    }
}
