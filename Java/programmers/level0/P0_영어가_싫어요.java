package Algorithm.programmers.level0;

// https://school.programmers.co.kr/learn/courses/30/lessons/120894
public class P0_영어가_싫어요 {
    public static void main(String[] args) {
        System.out.println(solution1("onetwothreefourfivesixseveneightnine"));   // 123456789
        System.out.println(solution1("onefourzerosixseven"));    // 14067

        System.out.println(solution2("onetwothreefourfivesixseveneightnine"));   // 123456789
        System.out.println(solution2("onefourzerosixseven"));    // 14067
    }

    // V1
    static public long solution1(String numbers) {
        long answer = 0;

        StringBuilder sb = new StringBuilder();

        while(!numbers.equals("")) {
            String three = "";
            String four = "";
            String five = "";

            if(numbers.length() >= 3) {
                three = numbers.substring(0, 3);
            }
            if(numbers.length() >= 4) {
                four = numbers.substring(0, 4);
            }
            if(numbers.length() >= 5) {
                five = numbers.substring(0, 5);
            }

            if(four.equals("zero")) {
                sb.append("0");
                numbers = numbers.substring(4);
                continue;
            }
            if(three.equals("one")) {
                sb.append("1");
                numbers = numbers.substring(3);
                continue;
            }
            if(three.equals("two")) {
                sb.append("2");
                numbers = numbers.substring(3);
                continue;
            }
            if(five.equals("three")) {
                sb.append("3");
                numbers = numbers.substring(5);
                continue;
            }
            if(four.equals("four")) {
                sb.append("4");
                numbers = numbers.substring(4);
                continue;
            }
            if(four.equals("five")) {
                sb.append("5");
                numbers = numbers.substring(4);
                continue;
            }
            if(three.equals("six")) {
                sb.append("6");
                numbers = numbers.substring(3);
                continue;
            }
            if(five.equals("seven")) {
                sb.append("7");
                numbers = numbers.substring(5);
                continue;
            }
            if(five.equals("eight")) {
                sb.append("8");
                numbers = numbers.substring(5);
                continue;
            }
            if(four.equals("nine")) {
                sb.append("9");
                numbers = numbers.substring(4);
                continue;
            }
        }

        answer = Integer.parseInt(sb.toString());

        return answer;
    }

    // V2
    static public long solution2(String numbers) {
        long answer = 0;

        numbers = numbers.replaceAll("zero", "0");
        numbers = numbers.replaceAll("one", "1");
        numbers = numbers.replaceAll("two", "2");
        numbers = numbers.replaceAll("three", "3");
        numbers = numbers.replaceAll("four", "4");
        numbers = numbers.replaceAll("five", "5");
        numbers = numbers.replaceAll("six", "6");
        numbers = numbers.replaceAll("seven", "7");
        numbers = numbers.replaceAll("eight", "8");
        numbers = numbers.replaceAll("nine", "9");

        answer = Long.parseLong(numbers);

        return answer;
    }
}
