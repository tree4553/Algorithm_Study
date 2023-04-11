package DailyCoding;

// 카이사르 암호화 되어있는 문자열과 key를 입력받아서
// 복호화 된 결과를 반환해라.
// 카이사르 암호화는 key 값만큼 문자열을 오른쪽으로 평행이동시켜 암호화 한다.
// 암호화 되어있는 문자열은 소문자 알파벳만으로 구성되어있다.
public class D_19_DecryptCaesarCipher {
    public static void main(String[] args) {
        String output = decryptCaesarCipher("khoor", 3);
        System.out.println(output); // --> hello

        output = decryptCaesarCipher("zruog", 3);
        System.out.println(output); // --> world

        output = decryptCaesarCipher("mnv xnt zqd qdzcx sn lnud sn hlldqrhud bntqrd", 25);
        System.out.println(output); // --> now you are ready to move to immersive course

    }


    private static String decryptCaesarCipher(String str, int secret) {
//        // !으어 이 방법은 secret 값이 클경우 문자열을 벗어나서 특수문자들을 저장해버리네..
//        // 스트링의 한글자씩을 가져다가 캐릭터에 담아서
//        // 캐릭터에 secret 값을 빼준 후
//        // 결과 값에 더해주자
//        String result = "";
//        for (int i = 0; i < str.length(); i++) {
//            char temp = str.charAt(i);
//            temp -= secret;
//            if(temp > )
//            // String에 char를 더해서 자동 형변환을 통해 String으로 저장되게 만들자.
//            result = result + (char)(temp-secret);
//        }
//
//        return result;

        // 알파벳 String에 a-z를 담아서 저장해놓고
        // str의 한글자씩 가져다가 알파벳에 indexof 함수를 써서 위치를 찾고
        // secret 만큼 이동한 위치의 알파벳을 결과에 더해서 저장하자
        // secret이 26보다 큰경우 26으로 나머지 연산을 해주고 이동시키자
        // secret 만큼 이동하였는데 알파벳 범위를 벗어나는 경우를 막기위해
        // 0보다 작은 경우에 대한 처리를 해주자.

        final int ALPHABET_COUNT = 26;
        if(secret == ALPHABET_COUNT) return str;
        if(secret > ALPHABET_COUNT) secret %= ALPHABET_COUNT;

        String result = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            if(letter == ' ') {
                result = result + ' ';
                continue;
            }

            int index = alphabet.indexOf(letter);
            index -= secret;
            // index가 음수라면 알파벳 뒤에서 부터 음수값 만큼 이동시켜주자.
            if(index < 0) index += ALPHABET_COUNT;
            // String에 char를 더해서 자동 형변환을 통해 String으로 저장되게 만들자.
            result = result + alphabet.charAt(index);
        }

        return result;
    }
}
