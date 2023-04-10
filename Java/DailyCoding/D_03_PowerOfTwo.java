package Algorithm.DailyCoding;

// 수를 입력받아 2의 거듭제곱인지 여부를 리턴해라
public class D_03_PowerOfTwo {
    public static void main(String[] args) {
        boolean output1 = powerOfTwo(16);
        System.out.println(output1); // true
        boolean output2 = powerOfTwo(22);
        System.out.println(output2); // false
    }

    private static boolean powerOfTwo(long num) {
        if(num == 1) return true;
        if(num % 2 == 1) return false;

        long temp = 2;
        while(temp < num) {
            temp = temp * 2;
        }
        if(num == temp) return true;
        return false;
    }
}
