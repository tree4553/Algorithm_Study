package Algorithm.DailyCoding;

// 문자열을 입력받아서 문자열에서 숫자를 모두 찾아서 더한 뒤
// 더한 값을 문자열의 길이로 나눈 값을 정수로 반올림하여 반환해라.
// 공백과 숫자는 문자열의 길이에 포함하지 않는다.
public class D_18_NumberSearch {
    public static void main(String[] args) {
        int output = numberSearch("Hello6 ");
        System.out.println(output); // --> 1

        output = numberSearch("Hello6 9World 2,");
        System.out.println(output); // --> 2

        output = numberSearch("Hello6 9World 2, Nic8e D7ay!");
        System.out.println(output); // --> 2
    }

    private static int numberSearch(String str) {
        // A 문자열에 있는 모든 숫자들을 더해서 저장할 변수를 하나 만든다.
        int sum = 0;
        // B 문자열에 있는 숫자와 공백이 아닌 갯수를 저장할 변수를 하나 만든다.
        int count = 0;

        // for문으로 문자열의 한자리씩을 숫자인지 확인한다.
        for (int i = 0; i < str.length(); i++) {
            // 숫자이면은 A에 더해준다.
            if(str.charAt(i) > 47 && str.charAt(i) < 58) {
                int temp = str.charAt(i);
                int zero = '0';
                sum += Integer.valueOf(str.charAt(i)-'0');
            }
            // 문자이면 B에 1을 더해준다.
            else if(str.charAt(i) != ' ') {
                count += 1;
            }
        }
        // 힌트 : char , ASCII

        // A를 B로 나눠서 소숫점 첫째자리에서 반올림한 값을 반환한다.
        int result = (int)(Math.round((double)sum / (double)count));
        return result;
    }
}
