package Algorithm.programmers.level0;

// https://school.programmers.co.kr/learn/courses/30/lessons/120902
public class P0_문자열_계산하기 {
    public static void main(String[] args) {
        System.out.println(solution("3 + 4"));  // 7
        System.out.println(solution("1 + 2 + 3"));  // 6
    }

    static public int solution(String my_string) {
        int answer = 0;

        String[] stringArr = my_string.split(" ");
        answer = Integer.parseInt(stringArr[0]);

        for (int i = 0; i < stringArr.length; i++) {
            if(stringArr[i].equals("+")) {
                answer += Integer.parseInt(stringArr[i + 1]);
            }
            else if (stringArr[i].equals("-")){
                answer -= Integer.parseInt(stringArr[i + 1]);
            }
        }

        return answer;
    }
}
