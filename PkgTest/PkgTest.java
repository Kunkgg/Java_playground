import java.util.ArrayList;

class PkgTest {
    public static void main(String[] args) {

        // import built-in package ArrayList
        printTitle("import built-in package ArrayList");
        ArrayList<Integer> myList = new ArrayList<>(3);
        myList.add(3);
        myList.add(2);
        myList.add(1);

        System.out.println(myList);
    }

    static void printTitle(String arg){
        int titleLength = arg.length();
        String spilter = "";

        for(int i = 0; i < titleLength; i++) {
            spilter += "=";
        }

        System.out.println(spilter);
        System.out.println(arg);
        System.out.println(spilter);
    }
}
