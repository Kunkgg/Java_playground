public class MorseCodeDecoder extends MorseCode {
    public static String decode(String morseCode) {
        // your brilliant code here, remember that you can access the preloaded Morse code table through MorseCode.get(code)
        String decoded = "";
        String[] words = morseCode.split("   ");

        for(int i = 0; i < words.length; i++){
            String[] codes = words[i].split(" ");
            String decodedWord = "";
            for(String code : codes) {
                decodedWord += MorseCode.get(code);
            }
            if (i != 0) {
                decodedWord = " " + decodedWord;
            }
            decoded += decodedWord;
        }
        return decoded;
    }

    public static void main(String[] args){
        String input = ".... . -.--   .--- ..- -.. .";
        System.out.println(input);
        System.out.println(MorseCodeDecoder.decode(input));
    }
}
