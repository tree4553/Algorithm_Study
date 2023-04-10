package Algorithm.DailyCoding;

import java.util.HashMap;

// 2차원 배열을 입력받아 각 배열을 이용해 만든 HashMap을 리턴해라
public class D_07_ConvertListToObject {
    public static void main(String[] args) {
        String[][] arr = {
                {"make", "Ford"},
                {"model", "Mustang"},
                {"year", "1964"},
                {"make", "Bill"},
        };

        HashMap<String, String> output = convertListToObject(arr);

        System.out.println(output);

//        {
//            "make" = "Ford",
//            "model" = "Mustang",
//            "year" = "1964"
//        }
    }

    private static HashMap<String, String> convertListToObject(String[][] arr) {
        HashMap<String, String> result = new HashMap<>();
        if(arr.length == 0 || arr[0].length == 0) return result;


        for(String[] temp : arr) {
            if(result.containsKey(temp[0]) == false) {
                result.put(temp[0], temp[1]);
            }
        }
        return result;
    }
}
