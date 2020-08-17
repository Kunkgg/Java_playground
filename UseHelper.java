import com.test.Helper;
import com.test.Test;

class UseHelper {
    public static void main(String[] args){

        double value = 99.5;
        String formattedDollar = Helper.getFormattedDollar(value);
        System.out.println("formattedDollar = " + formattedDollar);

        String formattedRMB = Test.getFormattedRMB(value);
        System.out.println("formattedRMB = " + formattedRMB);
    }
}
