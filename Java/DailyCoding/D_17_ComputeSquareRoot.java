package DailyCoding;

// 입력된 수에 대한 제곱근을 소수점 셋째자리에서 반올림하여 둘째자리까지의 값을 반환해라.
// Math.sqrt 는 사용하지 않는다.
public class D_17_ComputeSquareRoot {
    public static void main(String[] args) {
        String output = computeSquareRoot(9);
        System.out.println(output); // --> "3.00"

        output = computeSquareRoot(6);
        System.out.println(output); // --> "2.45"
    }

    // 바빌로니아 법으로 구현해보자
    private static String computeSquareRoot(int num) {
        String result = "";
        // 먼저 num이 어느 숫자 사이에 있는지 구하자
        float x = 1;
        while(x * x < num) {
            x += 1;
        }

        // 구한 x의 제곱이 num과 같으면 바로 반환하려 했는데 미세한 오차때문에 바로 빠져나가지는 못하네
//        if(x * x == num) {
//            result = String.format("%.2f", x);
//        }

        // 바빌로니아 법을 위해 작은 수의 값을 x에 넣어준다.
        x -= 1;

        // 반복 횟수는 일단 3번으로 해보자.
        int repeatCount = 3;
        for (int i = 0; i < repeatCount; i++) {
            // 바빌로니아 법 점화식 => 루트num = 1/2 * (x + num/x)
            // x는 a * a > num > b * b 에서 b이다.
            x = (x + num/x) / 2;
        }

        // 소수점 셋째 자리에서 반올림 해주는 연산
        // 반올림에 대한 계산을 따로 구현했는데 아래의 String.format 부분에서 자동으로 반올림 처리가 되어서
        // 필요가 없다.
//        if(x * 1000 % 10 > 4) {
//            x += 0.01;
//        }

        // result에 x를 소숫점 둘째까지만 담아서 반환
        result = String.format("%.2f", x);
        return result;
    }
}
