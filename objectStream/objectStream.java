import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * objectStream
 */
class Dog implements Serializable {
    String name;
    String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
}

public class objectStream {
    public static void main(String[] args) {

        String fpath = "file.txt";
        String data1 = "data1: This is a test line.";
        int data2 = 100;
        Dog dog = new Dog("xiaohei", "Chinese native");

        try {
            FileOutputStream fileOutput = new FileOutputStream(fpath);
            ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);

            objectOutput.writeInt(data2);
            objectOutput.writeObject(data1);
            objectOutput.writeObject(dog);


            fileOutput.close();
            objectOutput.close();

            FileInputStream fileInput = new FileInputStream(fpath);
            ObjectInputStream objectInput = new ObjectInputStream(fileInput);

            System.out.println("available: " + objectInput.available());
            System.out.println("data 2: " + objectInput.readInt());
            System.out.println("data 1: " + objectInput.readObject());

            Dog newDog = (Dog) objectInput.readObject();
            System.out.println("Dog name: " + newDog.name);
            System.out.println("Dog breed: " + newDog.breed);

            fileInput.close();
            objectInput.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
