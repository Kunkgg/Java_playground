import java.util.ArrayList;
import java.util.Scanner;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.ArrayList;

public class MorseCodeDecoder extends MorseCode {
    public static String decode(String morseCode) {
        ArrayList<String> decoded = new ArrayList<>();
        String[] words = morseCode.split("   ");

        for (int i = 0; i < words.length; i++) {
            String[] codes = words[i].split(" ");
            ArrayList<String> decodedCharList = new ArrayList<>();
            for (String code : codes) {
                decodedCharList.add(MorseCode.get(code));
            }
            decoded.add(String.join("", decodedCharList));
        }

        return String.join(" ", decoded);
    }

    public static Map<String, String> reverseMorseCode = new HashMap<>();

    public static void getReverseMorseCode() {
        for (Entry<String, String> entry : MorseCode.morseMap.entrySet()) {
            reverseMorseCode.put(entry.getValue(), entry.getKey());
            // System.out.println(entry);
        }
        // System.out.println(reverseMorseCode);
    }

    public static String encode(String text) {

        ArrayList<String> encoded = new ArrayList<>();
        text = text.toUpperCase();

        String[] wordList = text.split(" ");

        for (String word : wordList) {
            ArrayList<String> encodeWord = new ArrayList<>();
            for (int i = 0; i < word.length(); i++) {
                encodeWord.add(reverseMorseCode.get(String.valueOf(word.charAt(i))));
            }
            encoded.add(String.join(" ", encodeWord));
        }

        return String.join("   ", encoded);
    }

    public static void main(String[] args) {
        // String encoded;
        // Scanner input = new Scanner(System.in);
        // while (true) {
        // encoded = input.nextLine();
        // if (encoded.equals("")) {
        // System.out.println("Exit ...");
        // input.close();
        // System.exit(0);
        // }
        // System.out.println("Encoded: " + encoded);
        // System.out.println("Decoded: " + MorseCodeDecoder.decode(encoded));
        // }

        // String encoded = "...---...";
        // System.out.println(MorseCodeDecoder.decode(encoded));
        getReverseMorseCode();
        // test for decode and encdoe {{{ //

        String text1 = "Hello Hello";
        String text2 = "Java is a nice language.";
        String encoded1 = encode(text1);
        String encoded2 = encode(text2);
        System.out.println(encoded1);
        System.out.println(decode(encoded1));
        System.out.println(encoded2);
        System.out.println(decode(encoded2));
        // }}} test for decode and encdoe //
    }
}
