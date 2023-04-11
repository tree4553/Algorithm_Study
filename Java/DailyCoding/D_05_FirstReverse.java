package DailyCoding;

// 문자열을 입력받아 순서가 뒤집힌 문자열을 리턴해라
public class D_05_FirstReverse {
    public static void main(String[] args) {
        String output = firstReverse("codestates");
        System.out.println(output); // "setatsedoc"

        output = firstReverse("I love codestates");
        System.out.println(output); // "setatsedoc evol I"
    }

    private static String firstReverse(String str) {
        String result = "";
        for(int i = str.length() - 1; i > -1; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}
