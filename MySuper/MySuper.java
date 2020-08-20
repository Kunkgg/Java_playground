class Animal {

 // default or no-arg constructor
  Animal() {
    System.out.println("I am an animal");
  }

  // parameterized constructor
  Animal(String type) {
    System.out.println("Type: "+type);
  }
}

class Dog extends Animal {

  // default or no-arg constructor of class Dog
  Dog() {

    // calling default constructor of the superclass
    super("animal");

    System.out.println("I am a dog");
  }
}

class MySuper {
  public static void main(String[] args) {
    Dog dog1 = new Dog();
  }
}
