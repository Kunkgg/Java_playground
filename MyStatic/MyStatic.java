class Test {
    public static void method() {
        System.out.println("Here is a static method in class Test");
    }

    static int add(int a, int b){
        return a + b;
    }

    int multiply(int a, int b){
        return a * b;
    }
}



class MyStatic {
    public static void main(String[] args){
        // System.out.println("PI: " + Math.PI);
        // System.out.println("pow 2, 2: " + Math.pow(2, 2));

        // Test.method();

        Test t = new Test();

        System.out.println("10 + 20: " + t.add(10, 20));
        System.out.println("10 * 20: " + t.multiply(10, 20));
    }
}
