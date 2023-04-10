package Algorithm.DailyCoding;

// 문자열을 입력받아 각 단어의 첫 글자가 대문자인 문자열을 리턴해라
public class D_06_LetterCapitalize {
    public static void main(String[] args) {
        String output1 = letterCapitalize("hello world");
        System.out.println(output1); // "Hello World"
        String output2 = letterCapitalize("java  is good");
        System.out.println(output2); // "Java  Is Good"
    }

    private static String letterCapitalize(String str) {
        if(str.equals("")) return "";
        String result = "";
        String[] arr = str.split(" ");

        for(int i = 0 ; i < arr.length; i++) {
            if(arr[i].isEmpty() == false){
                arr[i] = Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1);
            }
        }

        result = String.join(" ", arr);
        return result;
    }
}
