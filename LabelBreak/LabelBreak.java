public class LabelBreak {
    public static void main(String[] args) {
        first:
        for(int i = 1; i < 5; i++) {
            second:
            for(int j = 1; j < 3; j++){
                System.out.printf("i = %d, j = %d%n", i, j);

                if (i == 2) {
                    break second;
                }
            }
        }
    }
}
