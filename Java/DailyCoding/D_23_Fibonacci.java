package Algorithm.DailyCoding;

import java.util.ArrayList;

// 피보나치 수열 중 n번째 항의 수를 리턴해라.
// 재귀를 이용해라. 반복문 사용 금지
// O(n) 복잡도로 풀어라.
public class D_23_Fibonacci {
    public static void main(String[] args) {
        int output = fibonacci(0);
        System.out.println(output); // --> 0

        output = fibonacci(1);
        System.out.println(output); // --> 1

        output = fibonacci(5);
        System.out.println(output); // --> 5

        output = fibonacci(9);
        System.out.println(output); // --> 34
    }

    // 실행 시간 초과
    // O(2^n) 복잡도
//    private static int fibonacci(int num) {
//        if(num == 0) return 0;
//        if(num == 1 || num == 2) return 1;
//        return fibonacci(num - 2) + fibonacci(num - 1);
//    }
    /*
    fib(5) = fib(3) + fib(4)
    = fib(1) + fib(2) + fib(2) + fib(3)
    = 1 + 1 + 1 + fib(1) + fib(2)
    = 1 + 1 + 1 + 1 + 1
    = 5

    fib(6) = f(4) + f(5)
    = f(2) + f(3) + f(3) + f(4)
    = 1 + f(1) + f(2) + f(1) + f(2) + f(2) + f(3)
    = 1 + 1 + 1 + 1 + 1 + 1 + f(1) + f(2)
    = 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1
    = 8

    fib(7) = f(5) + f(6)
    = 5 + 8
    = 13

    fib(8) = fib(6) + fib(7)
    = 8 + 13
    = 21

    fib(9) = fib(7) + fib(8)
    = 13 + 21
    = 34
     */

    // 메모이제이션 방법을 써서 풀면 된다드라
    // 크기가 정해진 배열 대신에 어레이리스트를 쓰면
    // 크기 설정 문제도 피할 수 있다.
    private static int fibonacci(int num) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(1);
        return fib(arr, num);
    }

    private static int fib(ArrayList<Integer> arr, int num) {
        return 0;
    }
}
