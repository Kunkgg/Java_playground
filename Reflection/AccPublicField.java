import java.lang.Class;
import java.lang.reflect.*;

class Dog {
  public String color;
}

class AccPublicField {
  public static void main(String[] args) {
     try{
         Dog d1 = new Dog();
        // create an object of the class Class
         Class obj = d1.getClass();

        // manipulating the public field type of Dog
         Field field1 = obj.getField("color"); // <.>
        // set the value of field
         field1.set(d1, "yellow");
       // get the value of field by converting in String
         String colorValue = (String)field1.get(d1);
         System.out.println("color: " + colorValue);
         System.out.println("color: " + d1.color);

         // get the access modifier of type
         int mod1 = field1.getModifiers();
         String modifier1 = Modifier.toString(mod1);
         System.out.println("Modifier: " + modifier1);
         System.out.println(" ");
     }
     catch(Exception e) {
         e.printStackTrace();
     }
  }
}
