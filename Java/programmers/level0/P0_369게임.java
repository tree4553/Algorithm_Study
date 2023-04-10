package Algorithm.programmers.level0;

// https://school.programmers.co.kr/learn/courses/30/lessons/120891
public class P0_369게임 {
    public static void main(String[] args) {
        System.out.println(solution(3));        // 1
        System.out.println(solution(29423));    // 2
    }

    static public int solution(int order) {
        int answer = 0;
        String strOrder = String.valueOf(order);

        // 0이 오는 경우를 빼먹어서 오답 발생했었다.
        for (int i = 0; i < strOrder.length(); i++) {
            if((strOrder.charAt(i) - '0') % 3 == 0 && strOrder.charAt(i) != '0') {
                answer += 1;
            }
        }

        return answer;
    }
}
