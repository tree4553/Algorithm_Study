package DailyCoding;

// 두 수를 입력받아 앞의 수를 뒤의 수로 나눈 나머지를 리턴해라
// 단 나눗셈, 나머지 연산자는 사용 금지
// 0으로는 나눌 수 없으니 null 리턴
public class D_15_Modulo {
    public static void main(String[] args) {
        Integer output = modulo(25, 4);
        System.out.println(output); // --> 1

        output = modulo(25, 0);
        System.out.println(output); // --> null
    }

    private static Integer modulo(int num1, int num2) {
        if(num2 == 0) return null;
        if(num1 == 0) return 0;
        while(num1 > 0) {
            if(num1 - num2 == 0) return 0;
            if(num1 - num2 < 0) return num1;
            num1 -= num2;
        }

        return null;
    }


}
