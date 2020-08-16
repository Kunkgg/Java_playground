public class MyTypeCast {
    public static void main(String[] args){
        // widening type casting from int into double
        printTitle("From int into double");
        int inter1 = 10;
        double double1 = inter1; // <.>

        System.out.print("From: ");
        System.out.println(inter1);
        System.out.print("into: ");
        System.out.println(double1);

        // narrowing type casting from double into int
        printTitle("From double into int");
        double double2 = 20.5d;
        int inter2 = (int) double2; // <.>

        System.out.print("From: ");
        System.out.println(inter2);
        System.out.print("into: ");
        System.out.println(double2);

        // from int into string
        printTitle("From int into string");
        int inter3 = 100;
        String str3 = String.valueOf(inter3); // <.>

        System.out.print("From: ");
        System.out.println(inter3);
        System.out.print("into: ");
        System.out.println(str3);

        // from string into int
        printTitle("From string into int");
        String str4 = "200";
        int inter4 = Integer.parseInt(str4); // <.>

        System.out.print("From: ");
        System.out.println(str4);
        System.out.print("into: ");
        System.out.println(inter4);

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
