package Algorithm.DailyCoding;

import java.util.HashMap;

// 배열을 입력받아 배열의 첫 요소와 마지막 요소를 키와 값으로 하는 HashMap을 리턴해라
public class D_01_TransformFirstAndLast {
    public static void main(String[] args) {
        String[] arr1 = new String[]{"Queen", "Elizabeth", "Of Hearts", "Beyonce"};
        HashMap<String, String> output1 = transformFirstAndLast(arr1);
        System.out.println(output1); // --> { Queen : 'Beyonce' }

        String[] arr2 = new String[]{"Kevin", "Bacon", "Love", "Hart", "Costner", "Spacey"};
        HashMap<String, String> output2 = transformFirstAndLast(arr2);
        System.out.println(output2); // --> { Kevin : 'Spacey' }
    }

    private static HashMap<String, String> transformFirstAndLast(String[] arr) {
        if(arr.length == 0) return null;

        HashMap<String, String> hash = new HashMap<>();
        hash.put(arr[0], arr[arr.length - 1]);
        return hash;
    }


}
