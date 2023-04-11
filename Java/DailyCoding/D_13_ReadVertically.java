package DailyCoding;

// 문자열 배열을 입력받아 문자열을 세로로 읽엇을 때의 문자열을 리턴해라
public class D_13_ReadVertically {
    public static void main(String[] args) {
        String[] input = new String[]{
                "hello",
                "wolrd",
        };
        String output = readVertically(input);
        System.out.println(output); // --> "hweolllrod"

        input = new String[]{
                "hi",
                "wolrd",
        };
        output = readVertically(input);
        System.out.println(output); // --> "hwiolrd"
    }

    public static String readVertically(String[] arr) {
        // 재귀 써야할듯
        String result = "";

        // 배열 첫번째꺼 빼서 더해주고
        // 다음꺼 빼서 더해주고
        // 빌때까지 더해주고
        // 비어있으면 반환?
        boolean isRun = false;
        for (int i = 0; i < arr.length; i++) {
            // 종료 조건
            if(arr[i].length() == 0) continue;
            // 남아있는게 있다면 isRun 을 트루로
            isRun = true;
            // 값을 넣어줘야하는데
            // 어디다가 어뜨케 넣어줄까
            result += arr[i].charAt(0);
            arr[i] = arr[i].substring(1,arr[i].length());
        }
        if(isRun == true){
            result += readVertically(arr);
        }

        return result;
    }
}
