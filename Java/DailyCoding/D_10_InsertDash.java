package DailyCoding;

// 문자열을 받아서 연속된 한자리 홀수 숫자 사이네 -를 추가해서 리턴해라
public class D_10_InsertDash {
    public static void main(String[] args) {
        String output = insertDash("454793");
        System.out.println(output); // --> 4547-9-3
    }

    private static String insertDash(String str) {
        if(str.length() == 0) return null;

        String result = "" + str.charAt(0);
        for(int i = 0; i < str.length() - 1; i++) {
            int a = str.charAt(i) - '0';
            int b = str.charAt(i + 1) - '0';
            if(a % 2 == 1 && b % 2 == 1) {
                result += "-" + b;
            }
            else {
                result = result + b;
            }
        }
        return result;
    }
}
