import java.lang.Class;
import java.lang.reflect.*;

interface Animal {
   public void display();
}

class Dog implements Animal {
   public void display() {
       System.out.println("I am a dog.");
   }
}

class GetSuperclassAndAccessModifier {
   public static void main(String[] args) {
       try {
           // create an object of Dog class
           Dog d1 = new Dog();

           // create an object of Class using getClass()
           Class obj = d1.getClass();

          // Get the access modifier of Dog in integer form
           int modifier = obj.getModifiers();
           System.out.println("Modifier: " + Modifier.toString(modifier));

           // Find the superclass of Dog
           Class superClass = obj.getSuperclass();
           System.out.println("Superclass: " + superClass.getName());
       }

       catch(Exception e) {
           e.printStackTrace();
       }
   }
}
