package Algorithm.DailyCoding;

import java.util.Arrays;

// 정수 배열을 입력받아서 오름차순으로 정렬하여 리턴하는 버블 정렬을 구현하자.
public class D_22_BubbleSort {
    public static void main(String[] args) {
        int[] output = bubbleSort(new int[]{2, 1, 3});
        System.out.println(Arrays.toString(output)); // --> [1, 2, 3]

        output = bubbleSort(new int[]{2, 1, 3, 4});
        System.out.println(Arrays.toString(output)); // --> [1, 2, 3]
    }

    private static int[] bubbleSort(int[] arr) {
        // 버블 버블
        // 실행 시간 초과 뜸 다른 방법을 찾아보자
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if(arr[i] > arr[j]) {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        return arr;

        // 재관님이 도와주심 개쩜
        int whileEndCount = 0;
        int forEndCount = 0;
        while(true) {
            whileEndCount += 1;
            //System.out.printf("%d번 실행했지롱\n",forEndCount);
            for (int i = 0; i < arr.length-1; i++) {
                int a = arr[i];
                int b = arr[i+1];
                if(a > b){
                    int temp = a;
                    arr[i] = b;
                    arr[i+1] = temp;
                    forEndCount += 1;
                }
            }
            if(forEndCount == 0) {
                break;
            }
            if(whileEndCount == arr.length) {
                break;
            }
        }

        return arr;
    }
}