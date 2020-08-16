public class Persist {
    public static void main(String[] args){
        int i = 0;
        int number = 958;

        do {
            int res = converter(number);
            System.out.println(res);
        } while (number != res);

    }

    static int converter(int arg) {
        String numStr = String.valueOf(arg);
        String[] numList = numStr.split("");
        int result = 1;

        for(String num : numList) {
            result *= Integer.parseInt(num);
        }

        return result;
    }
}
