public class Persist {
    public static void main(String[] args){
        int i = 0, number = 958, res;
        do {
            i++;
            res = converter(number);
            System.out.println(res);
            if ( res == number) {
                break;
            } else {
                number = res;
            }
        } while (true);

        System.out.println(i);
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
