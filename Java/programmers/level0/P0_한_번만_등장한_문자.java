package Algorithm.programmers.level0;

// https://school.programmers.co.kr/learn/courses/30/lessons/120896
public class P0_한_번만_등장한_문자 {
    public static void main(String[] args) {
        System.out.println(solution("abcabcadc"));  // "d"
        System.out.println(solution("abdc"));       // "abcd"
        System.out.println(solution("hello"));      // "eho"
    }

    static public String solution(String s) {
        int[] alphabet = new int[26];

        for (int i = 0; i < s.length(); i++) {
            alphabet[s.charAt(i) - 'a'] += 1;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < alphabet.length; i++) {
            if(alphabet[i] == 1) {
                sb.append((char) (i + 'a'));
            }
        }
        return sb.toString();
    }
}
