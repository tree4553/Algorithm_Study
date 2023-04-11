package DailyCoding;

// 수의 배열을 입력받아 각 요소들이 그 이전의 요소들의 합보다 큰지 여부를 리턴해라
public class D_14_SuperIncreasing {
    public static void main(String[] args) {
        boolean output = superIncreasing(new int[]{1, 3, 6, 13, 54});
        System.out.println(output); // --> true

        output = superIncreasing(new int[]{1, 3, 5, 9});
        System.out.println(output); // --> false

        output = superIncreasing(new int[]{979, 1737, -2146, -337, 1316});
        System.out.println(output); // --> false
    }

    private static boolean superIncreasing(int[] arr) {
        int body = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            body += arr[i]; // body에 누적
            if(body >= arr[i + 1]) return false;    // 다음 arr의 값이 더 크면 false 반환
        }

        return true;
    }
}
