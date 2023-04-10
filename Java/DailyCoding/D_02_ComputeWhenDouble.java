package Algorithm.DailyCoding;

// 연이율을 입력받아 원금이 2배 이상이 될때까지 걸리는 시간을 리턴해라
public class D_02_ComputeWhenDouble {
    public static void main(String[] args) {
        int output = computeWhenDouble(7);
        System.out.println(output); // --> 11

        output = computeWhenDouble(10);
        System.out.println(output); // --> 8
    }

    private static int computeWhenDouble(double interestRate) {
        int count = 0;
        double money = 1;
        while(money < 2) {
            money *= (1 + interestRate * 0.01);
            count += 1;
        }
        return count;
    }
}
