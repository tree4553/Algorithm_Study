package Algorithm.programmers.level0;

import java.util.ArrayList;
import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/120913
public class P0_잘라서_배열로_저장하기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("abc1Addfggg4556b", 6)));   // ["abc1Ad", "dfggg4", "556b"]
        System.out.println(Arrays.toString(solution("abcdef123", 3)));  // ["abc", "def", "123"]
    }

    static public String[] solution(String my_str, int n) {
        ArrayList<String> arr = new ArrayList<>();

        while(!my_str.equals("")) {
            String value = "";
            if(my_str.length() >= n) {
                value = my_str.substring(0, n);
                my_str = my_str.substring(n);
            }
            else {
                value = my_str.substring(0, my_str.length());
                my_str = my_str.substring(my_str.length());
            }

            arr.add(value);
        }

        String[] answer = arr.toArray(new String[arr.size()]);
        return answer;
    }
}
