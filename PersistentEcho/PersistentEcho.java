import java.util.Properties;
import java.io.FileOutputStream;
import java.io.FileInputStream;

/**
 * PersistentEcho If PersistentEcho is run with command line arguments, it
 * prints out those arguments. It also saves the string printed out to a
 * property, and saves the property to a file called PersistentEcho.txt
 *
 * If PersistentEcho is run with no command line arguments, it looks for an
 * environment variable called PERSISTENTECHO. If that variable exists,
 * PersistentEcho prints out its value, and also saves the value in the same way
 * it does for command line arguments.
 *
 * If PersistentEcho is run with no command line arguments, and the
 * PERSISTENTECHO environment variable is not defined, it retrieves the property
 * value from PersistentEcho.txt and prints that out.
 */
public class PersistentEcho {
    static String fname = "PersistentEcho.txt";
    static String envName = "PERSISTENTECHO";
    static Properties newProperties = new Properties();

    static void printProperties() {
        for (String key : newProperties.stringPropertyNames()) {
            System.out.printf("%s => %s%n", key, newProperties.get(key));
        }
    }

    public static void main(String[] args) {

        if (args != null && args.length > 0) {
            for (String arg : args) {
                if (arg.contains("=")) {
                    String[] temp = arg.split("=");
                    String key = temp[0];
                    String value = temp[1];
                    newProperties.setProperty(key, value);
                } else {
                    newProperties.setProperty(arg, "true");
                }
            }
            System.out.println("Loaded config from CLI");
            printProperties();
            try {
                FileOutputStream out = new FileOutputStream(fname);
                newProperties.store(out, "---No Comment---");
                out.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (System.getenv(envName) != null) {
            newProperties.setProperty(envName, System.getenv(envName));

            System.out.println("Loaded config from env");
            System.out.printf("%s => %s%n", envName, newProperties.getProperty(envName));
        } else {
            try {
                FileInputStream in = new FileInputStream(fname);
                newProperties.load(in);
                in.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Loaded config from config file");
            printProperties();
        }
    }
}
