abstract class Animal{
    abstract void makeNoise();
}

class Dog extends Animal {
    Dog(){
        System.out.println("Here is a dog!");
    }

    void makeNoise() {
        System.out.println("Bark! Bark! ...");
    }

}

class Cat extends Animal {
    Cat(){
        System.out.println("Here is a cat!");
    }

   public void makeNoise() {
      System.out.println("Meows ");
   }
}

class MyAbstract {
    public static void main(String[] args){
        Dog d = new Dog();
        d.makeNoise();

        Cat c = new Cat();
        c.makeNoise();

    }
}
