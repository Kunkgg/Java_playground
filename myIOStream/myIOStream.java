import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ByteArrayInputStream;

/**
 * myIOStream
 */
public class myIOStream {

    public static void main(String[] args) {

        String fpath = "test.txt";

        // read and write file by byte array {{{ //
        // byte[] arr = new byte[100];
        // try {

        // InputStream input = new FileInputStream(fpath);
        // System.out.println("Available bytes in file: " + input.available());
        // input.read(arr);

        // String data = new String(arr);
        // System.out.println("read from file: " + data);

        // input.close();

        // byte[] newline = (data + "secondline").getBytes();
        // OutputStream output = new FileOutputStream(fpath, true);
        // output.write(newline);
        // output.close();
        // } catch (Exception e) {
        // e.printStackTrace();
        // }
        // }}} read file by byte array //

        // read file by byte {{{ //
        // try {
        // InputStream input = new FileInputStream(fpath);

        // int i;
        // do {
        // i = input.read();
        // // System.out.print((char) i);
        // System.out.println(i);
        // } while (i != -1);
        // input.close();
        // System.out.println();
        // } catch(Exception e){
        // e.printStackTrace();
        // }

        // }}} read file by byte //

        // write file by byte {{{ //
        try (OutputStream output = new FileOutputStream(fpath)) {
            char i = 'a';

            output.write((byte) i);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // }}} write file by byte //

        // byte array input {{{ //
        // byte[] arr = {1,2,3,4,5};
        byte[] arr = { 'a', 'b' };
        try (ByteArrayInputStream input = new ByteArrayInputStream(arr)) {
            int c;
            for (int i = 0; i < arr.length; i++) {
                c = input.read();
                System.out.print((char) c + ", ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        // }}} byte array input //

    }
}
