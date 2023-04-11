package DailyCoding;

// 문자열을 입력받아 각 단어의 첫 글자로 이루어진 문자열을 리턴해라
public class D_04_FirstCharacter {
    public static void main(String[] args) {
        String output = firstCharacter("hello world");
        System.out.println(output); // --> "hw"

        output = firstCharacter(
                "The community at Code States might be the biggest asset"
        );
        System.out.println(output); // --> "TcaCSmbtba"
    }

    private static String firstCharacter(String str) {
        if(str.length() == 0) return "";
        String result = "";

        String[] arr = str.split(" ");

        for(String temp : arr) {
            result = result + temp.charAt(0);
        }

        return result;
    }
}
