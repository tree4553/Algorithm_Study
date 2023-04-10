package Algorithm.DailyCoding;

// 문자열을 입력받아 두 칸의 공백을 모두 한 칸의 공백으로 바꾼 문자열을 리턴해라
public class D_08_ConvertDoubleSpaceToSingle {
    public static void main(String[] args) {
        String output = convertDoubleSpaceToSingle("string  with  double  spaces");
        System.out.println(output); // --> "string with double spaces"
    }

    private static String convertDoubleSpaceToSingle(String str) {
        str = str.replaceAll("  ", " ");
        return str;
    }
}
