package DailyCoding;

// 문자열을 입력받아 연속되는 문자가 있는 경우 3글자 이상 연속된 문자는 숫자와 문자로 나타내라.
// ex) abbbcc => a3bcc
public class D_20_CompressString {
    public static void main(String[] args) {
        String output = compressString("abc");
        System.out.println(output); // --> "abc"

        output = compressString("wwwggoppopppp");
        System.out.println(output); // --> "3wggoppo4p"
    }

    private static String compressString(String str) {
        if (str.length() == 0) return str;

        String result = "";

        // 이중 반복문 말고 다른 풀이는 잘 모르겠네
        // for문 하나로 문자열 하나하나 접근하고
        // 그 안에 for문으로 다음 문자열이랑 비교하게 하면 되려나
        for (int i = 0; i < str.length(); i++) {
            char head = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length() - i; j++) {
                // head와 다음 문자열이 같다면 count 증가
                if (head == str.charAt(i + j)) {
                    count += 1;
                    // 마지막 글자가 아니라면 continue
                    if(i + j != str.length() - 1) {
                        continue;
                    }
                }

                // 한글자인 경우 문자열 그냥 더하기
                if (count == 1) {
                    result += head;
                } else if (count == 2) {    // 두글자인 경우 두글자 그냥 더하기
                    result = result + head + head;
                } else {    // 세글자 이상인 경우 count숫자랑 문자 더하기
                    result = result + String.valueOf(count) + head;
                }
                i += count - 1; // 반복문 횟수 줄이기
                break;
            }
        }

        return result;
    }
}
