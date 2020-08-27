/**
 * Maskify
 */
public class Maskify {

    public static String maskify(String input) {
        String output = "";
        if (input.length() <= 4) {
            output = input;
        } else {
            String tail = "";
            for (int i = 0; i < input.length() - 4; i++) {
                output += "#";
            }
            output = output + input.substring(input.length() - 4);
        }

        return output;
    }
}
