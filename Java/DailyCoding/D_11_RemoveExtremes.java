package Algorithm.DailyCoding;

import java.util.Arrays;

// 문자열 배열을 입력받아서 가장 짧은 문자열과 가장 긴 문자열을 제거한 배열을 리턴해라
public class D_11_RemoveExtremes {
    public static void main(String[] args) {
        String[] output = removeExtremes(new String[]{"a", "b", "c", "def"});
        System.out.println(Arrays.toString(output)); // --> ["a"', "b"]

        output = removeExtremes(new String[]{"where", "is", "the", "longest", "word"});
        System.out.println(Arrays.toString(output)); // --> ["where", "the", "word"]
    }

    private static String[] removeExtremes(String[] arr) {
        if(arr.length == 0) return null;
        int min = 0;
        int max = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[min].length() >= arr[i].length()) {
                min = i;
            }
            if(arr[max].length() <= arr[i].length()) {
                max = i;
            }
        }
        String[] result = new String[arr.length - 2];
        int index = 0;
        for(int i = 0 ; i < arr.length; i++) {
            if(i != min && i != max) {
                result[index] = arr[i];
                index += 1;
            }
        }
        return result;
    }
}
