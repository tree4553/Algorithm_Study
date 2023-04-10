package Algorithm.programmers.level0;

// https://school.programmers.co.kr/learn/courses/30/lessons/120888?language=java
public class P0_중복된_문자_제거 {
    public static void main(String[] args) {
        String ex1 = "people";
        System.out.println(solution(ex1));  // peol
        String ex2 = "We are the world";
        System.out.println(solution(ex2));  // We arthwold
    }

    static public String solution(String my_string) {
        // 그냥 반복문 때려서 n^2 복잡도로 풀어도 되나?
        for (int i = 0; i < my_string.length(); i++) {
            for (int j = i + 1; j < my_string.length(); j++) {
                if(my_string.charAt(i) == my_string.charAt(j)) {
                    my_string = my_string.substring(0, j) + my_string.substring(j + 1);
                    j -= 1; // 한글자를 빼줬기때문에 인덱스에 -1을 해줘야 한다.
                }
            }
        }

        return my_string;
    }
}
