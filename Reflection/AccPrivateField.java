import java.lang.Class;
import java.lang.reflect.*;

class Dog {
 private String color;
}

class AccPrivateField {
public static void main(String[] args) {
   try {
      Dog d1 = new Dog();
      // create an object of the class Class
      Class obj = d1.getClass();

      // accessing the private field
      Field field2 = obj.getDeclaredField("color"); // <.>

      // making the private field accessible
      field2.setAccessible(true); // <.>
      // set the value of color
      field2.set(d1, "white"); // <.>
      // get the value of type converting in String
      String colorValue = (String)field2.get(d1);
      System.out.println("color: " + colorValue);

      // get the access modifier of color
      int mod2 = field2.getModifiers();
      String modifier2 = Modifier.toString(mod2);
      System.out.println("modifier: " + modifier2);
   }
   catch(Exception e) {
      e.printStackTrace();
   }
 }
}
