package DailyCoding;

import java.util.Arrays;

// 배열을 입력받아 순서가 뒤집힌 배열을 리턴하라, 재귀로 구현해라
public class D_12_ReverseArr {
    public static void main(String[] args) {
        int[] output = reverseArr(new int[]{1, 2, 3});
        System.out.println(Arrays.toString(output)); // --> [3, 2, 1]
    }

    public static int[] reverseArr(int[] arr) {
        // 전에 푼건디 왜 기억이 안나니
        // 재귀로 풀어야된다
        // 인자로 배열 하나만 넘겨줘도 풀수있는거였나
        // 다른 함수 하나 만들어서 풀엇던거 같기도 한데
        // 전에 했던 생각 똑같이 하고 있네
        // 배열을자르고 붙여서 풀엇던거 같은데
        if(arr.length == 0) return arr;

        // 헤드 테일로 나눠서 더했던거 같은데
        // array copy 쓰고
        // !!!헤드에서 재귀를 태우고
        // 하나씩 잘라서 tail에다가 붙여준 다음에 리턴해주면
        // 되려나
        // 아 헤드에다가 맨앞에꺼 넣어놓고 나머지를 테일에 재귀 태어서 넣어준
        // 다음에 길이가 0이면 리턴해주고
        // tail 부분 밑에다가 새로운 배열 하나 만들어서
        // 헤드랑 테일이랑 합쳐서 리턴!!!!
        int[] head = Arrays.copyOfRange(arr, arr.length-1, arr.length);
        int[] tail = reverseArr(Arrays.copyOfRange(arr, 0, arr.length - 1));

        int[] union = new int[head.length + tail.length];
        System.arraycopy(head, 0, union, 0, head.length);
        System.arraycopy(tail, 0, union, head.length, tail.length);

        return union;
    }
}
