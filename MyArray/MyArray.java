public class MyArray {
    public static void main(String[] args) {
        int[] age = new int[5];
        String titleAge = "int[] Array";

        System.out.println(titleAge);
        for(int i = 0; i < titleAge.length(); i++){
            System.out.print("=");
        }
        System.out.println("");
        for(int i = 0; i < 5; i++){
            age[i] = (i + 1) * 10;
            System.out.printf("index %d: %d%n", i, age[i]);
        }

        String[] strlist;
        strlist = new String[10];
        String titleStrList = "String[] Array";

        System.out.println(titleStrList);
        for(int i = 0; i < titleStrList.length(); i++){
            System.out.print("=");
        }
        System.out.println("");

        System.out.println("String[] Array");
        for(int i = 0; i < 5; i++){
            strlist[i] = "rain";
            System.out.printf("index %d: %s%n", i, strlist[i]);
        }

    }
}
