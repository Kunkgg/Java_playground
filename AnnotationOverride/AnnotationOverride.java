class Animal{
    public void display(){
        System.out.println("This is an animal.");
    }
}

class Dog extends Animal{
    @Override
    public void display(){
        System.out.println("This is a dog.");
    }
}

class AnnotationOverride{
    public static void main(String[] args){
        Dog d = new Dog();

        d.display();
    }
}
