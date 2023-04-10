package Algorithm.programmers.level0;

// https://school.programmers.co.kr/learn/courses/30/lessons/120892
public class P0_암호_해독 {

    public static void main(String[] args) {
        System.out.println(solution("dfjardstddetckdaccccdegk", 4));    // "attack"
        System.out.println(solution("pfqallllabwaoclk", 2));            // "fallback"
    }

    static public String solution(String cipher, int code) {
        String answer = "";

        StringBuilder sb = new StringBuilder();

        if(code == 1) {
            return cipher;
        }

        for (int i = 1; i <= cipher.length() / code; i++) {
            sb.append(cipher.charAt(i * code - 1));
        }

        answer = sb.toString();
        return answer;
    }
}
