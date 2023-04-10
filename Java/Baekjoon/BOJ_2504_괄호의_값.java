package Algorithm.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

// https://www.acmicpc.net/problem/2504
public class BOJ_2504_괄호의_값 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(solution(input));

//        String sample1 = "(()[[]])([])";
//        System.out.println(sample1);
//        System.out.println(solution(sample1)); // 28
//        String sample2 = "[][]((])";
//        System.out.println(sample2); // 0
//        System.out.println(solution(sample2));
//        String sample3 = "[]()";
//        System.out.println(sample3); // 5
//        System.out.println(solution(sample3));
//        String sample4 = "][)(";
//        System.out.println(sample4);
//        System.out.println(solution(sample4));  // 0
    }

    // V1
    // 런타임 에러 발생
    // IndexOutOfBounds가 발생했는데
    // i + 2 부분에서 발생하는듯
    // if로 size랑 i + 2랑 비교해서 break 해주는 부분 추가
    // --> 시간 초과 발생
    // 어떤 경우에서 걸리는지 생각해 봐야 겠다.
    // 역시 경우를 나눠서 하는건 생각지 못한 예외 케이스가 발생하기 때문에 안쓰는게 좋겠다.

    // V2
    // 아마 기호 순서가 맞지 않는 경우에 걸려서 시간 초과 뜬듯
    // 기호 순서를 맞추면 size랑 i + 2 를 비교하는 부분 지워도 될듯
    // 기호 순서 맞지 않는 경우 처리했는데 런타임 에러 IndexOutOfBounds 발생

    // V3
    // ([)] 같은 경우를 잡지 못했다.
    // [) (} 경우가 있으면 0 반환 하도록 수정
    // 정답! 하지만 쓰레기 코드인거 같다.
    // 다른 사람이 짠 코드를 보자.
    static int solution(String input) {
        int answer = 0;

        ArrayList<String> strArr = new ArrayList<>();
        int[] count = new int[4];
        for (int i = 0; i < input.length(); i++) {
            strArr.add(String.valueOf(input.charAt(i)));
            if (input.charAt(i) == '(') count[0] += 1;
            if (input.charAt(i) == ')') count[1] += 1;
            if (input.charAt(i) == '[') count[2] += 1;
            if (input.charAt(i) == ']') count[3] += 1;
        }

        // 기호 갯수가 맞지 않으면 0 반환
        if (count[0] != count[1]) return 0;
        if (count[2] != count[3]) return 0;

        // 기호의 순서가 맞지 않는 경우도 확인해야 된다! (] [)
        for (int i = 0; i < strArr.size() - 1; i++) {
            if(strArr.get(i).equals("(") && strArr.get(i + 1).equals("]")) {
                return 0;
            }
            if(strArr.get(i).equals("[") && strArr.get(i + 1).equals(")")) {
                return 0;
            }
        }

        while (strArr.size() != 1) {
            for (int i = 0; i < strArr.size(); i++) {
                String front = strArr.get(i);
                String back = strArr.get(i + 1);
                if (front.equals("(") && back.equals(")")) {
                    strArr.set(i, "2");
                    strArr.remove(i + 1);
                    break;
                }

                if (front.equals("[") && back.equals("]")) {
                    strArr.set(i, "3");
                    strArr.remove(i + 1);
                    break;
                }

                if (Character.isDigit(front.charAt(0)) && Character.isDigit(back.charAt(0))) {
                    int frontInt = Integer.parseInt(front);
                    int backInt = Integer.parseInt(back);
                    strArr.set(i, String.valueOf(frontInt + backInt));
                    strArr.remove(i + 1);
                    break;
                }

//                if (strArr.size() <= i + 2) {
//                    break;
//                }

                if (front.equals("(") && Character.isDigit(back.charAt(0)) && strArr.get(i + 2).equals(")")) {
                    int a = Integer.parseInt(back);
                    strArr.set(i, String.valueOf(a * 2));
                    strArr.remove(i + 1);
                    strArr.remove(i + 1);   // i + 1을 제거한 상태에서 i + 2를 제거해야 하므로 i + 1로 대체
                    break;
                }

                if (front.equals("[") && Character.isDigit(back.charAt(0)) && strArr.get(i + 2).equals("]")) {
                    int a = Integer.parseInt(back);
                    strArr.set(i, String.valueOf(a * 3));
                    strArr.remove(i + 1);
                    strArr.remove(i + 1);      // i + 1을 제거한 상태에서 i + 2를 제거해야 하므로 i + 1로 대체
                    break;
                }
            }
        }
        answer = Integer.parseInt(strArr.get(0));
        return answer;
    }
}
