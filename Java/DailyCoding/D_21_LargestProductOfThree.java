package Algorithm.DailyCoding;

import java.util.Arrays;

// 정수 배열을 입력받아 3개의 요소를 곱해 나올 수 있는 최대값을 리턴해라.
// 음수와 0을 포함한다.
public class D_21_LargestProductOfThree {
    public static void main(String[] args) {
        int output = largestProductOfThree(new int[]{2, 1, 3, 7});
        System.out.println(output); // --> 42 (= 2 * 3 * 7)

        output = largestProductOfThree(new int[]{-1, 2, -5, 7});
        System.out.println(output); // --> 35 (= -1 * -5 * 7)
    }

    private static int largestProductOfThree(int[] arr) {
        // 정렬해서 제일 큰값들의 곱으로 리턴하자
        // 음수끼리의 곱이 양인 경우도 생각해야한다.
        // 0이 가장 큰 값인 경우도 생각해야한다.
        Arrays.sort(arr);
        
        // 배열 정렬 확인용 Stream 출력문
        //IntStream.of(arr).forEach(System.out::println);
        // 배열 출력 방법 2
        //System.out.println(Arrays.toString(arr));

        // 최대값을 구할 수 있는 모든 경우를 구해서 배열에 저장한 다음에
        // 가장 큰 값을 반환하도록 할까
        // 이러면 놓치는 케이스가 생길 수 있을것 같으니
        // 다른 방법을 찾자

        // 양수 세개 곱한값
        int case1 = arr[arr.length - 1] * arr[arr.length - 2] * arr[arr.length - 3];

        // 음수 가장 작은값 두개 양수 제일큰값 곱한값
        int case2 = arr[0] * arr[1] * arr[arr.length - 1];

        int result = Math.max(case1, case2);
        return result;
    }
}
