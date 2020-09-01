import java.io.PrintStream;

/**
 * printStream
 */
public class printStream {

    public static void main(String[] args) {
        String fpath = "file.txt";
        try {

            PrintStream output = new PrintStream(fpath);

            output.println("Hello flie.txt");
            output.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
