class Animal {
    protected void display () {
        System.out.println("I am an animal");
    }
}

class Dog extends Animal {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.display();
    }
}

class Zookeeper {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.display();
    }
}
