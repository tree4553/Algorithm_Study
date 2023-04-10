package Algorithm.programmers.level0;

// https://school.programmers.co.kr/learn/courses/30/lessons/120921
public class P0_문자열_밀기 {
    public static void main(String[] args) {
        System.out.println(solution("hello", "ohell")); // 1
        System.out.println(solution("apple", "elppa")); // -1
        System.out.println(solution("atat", "tata")); // 1
        System.out.println(solution("abc", "abc")); // 0
    }

    static public int solution(String A, String B) {
        // 두 문자열이 같은경우 0 반환
        if(A.equals(B)) return 0;

        for (int i = 0; i < A.length(); i++) {
            B = B.concat(String.valueOf(B.charAt(0)));
            B = B.substring(1);
            if(A.equals(B)) {
                return i + 1;
            }
        }

        return -1;
    }
}
