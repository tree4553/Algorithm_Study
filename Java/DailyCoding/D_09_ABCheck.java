package Algorithm.DailyCoding;

// 문자열 내에 a로 시작해서 b로 끝나는 길이 5의 문자열, b로 시작해서 a로 끝나는 5의 문자열을 리턴해라
public class D_09_ABCheck {
    public static void main(String[] args) {
        boolean output = ABCheck("lane Borrowed");
        System.out.println(output); // --> true
    }

    private static boolean ABCheck(String str) {
        str = str.toLowerCase();
        for(int i = 4; i < str.length(); i++) {
            if(str.charAt(i - 4) == 'a' && str.charAt(i) == 'b') return true;
            if(str.charAt(i - 4) == 'b' && str.charAt(i) == 'a') return true;
        }
        return false;
    }
}
