package Algorithm.DailyCoding;

import java.util.stream.IntStream;
import java.util.stream.Stream;

// 문자열을 입력받아 아이소그램인지 판별해라
// 아이소그램은 각 알파벳을 한번씩만 이용해서 만든 단어나 문구를 말한다.
// 대소문자는 구별하지 않는다.
public class D_16_IsIsogram {
    public static void main(String[] args) {
        boolean output = isIsogram("aba");
        System.out.println(output); // false

        output = isIsogram("Dermatoglyphics");
        System.out.println(output); // true

        output = isIsogram("moOse");
        System.out.println(output); // false
    }

    private static boolean isIsogram(String str) {
        // 반복문 두개 돌려서 진행하면 n^2 복잡도인데
        // 다른 방법으로 풀어보자

        // str을 Stream.of로 Stream을 만들어서 동작했더니
        // Stream<String> 안에 str 한개만 들어가서
        // distinct()가 제대로 동작을 하지 않는다.
        boolean result1 = Stream.of(str)
                .map(String::toUpperCase)
                .distinct()
                .count() == str.length();

        Stream<String> stream1 = Stream.of(str)
                .map(String::toUpperCase)
                .distinct();
        stream1.forEach(System.out::println);

        boolean result2 = str.chars()
                .map(Character::toUpperCase)
                .distinct()
                .count() == str.length();

        // Stream에 <Character> 형식은 없고 대신 IntStream을 사용한다.
        // Char 하나가 int로 된 숫자로 저장되기 때문
//        Stream<Character> stream2 = str.chars()
//                .map(Character::toUpperCase)
//                .distinct();

        IntStream stream2 = str.chars()
                .map(Character::toUpperCase)
                .distinct();

        System.out.println();

        stream2.mapToObj(s -> (char)s)
                .forEach(System.out::println);

        System.out.println();
        return result2;
    }
}
