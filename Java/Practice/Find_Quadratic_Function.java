package Practice;

public class Find_Quadratic_Function {
    public static void main(String[] args) {
        System.out.println(answer());
    }

    static public int question(int x) {
        int a = 14;
        int b = 12;
        int result = a * x * x + b * x;
        System.out.println("x : " + x);
        System.out.println("return : " + result);
        return result;
    }

    static public String answer() {
        // 주어진 값
        int x1 = 3;
        int y1 = question(x1);
        int x2 = 5;
        int y2 = question(x2);
        int x3 = 7;
        int y3 = question(x3);

        // a와 b 계산
        int a = (y3 - y1 - (x3 - x1) * (y2 - y1) / (x2 - x1)) / ((x3 * x3 - x1 * x1) - (x2 * x2 - x1 * x1) * (x3 - x1) / (x2 - x1));
        int b = (y2 - y1 - a * (x2 * x2 - x1 * x1)) / (x2 - x1);

        // 결과 반환
        return "a : " + a + ", b : " + b;
    }
}
