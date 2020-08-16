import java.util.Scanner;

public class Diamond{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the length of diamond edge:");

        int edge = input.nextInt();

        for(int line = 1; line <= edge; line++){
            for(int i = 0; i <= edge - line; i++){
                System.out.print(" ");
            }
            System.out.print("/");
            for(int i = 0; i <= (line - 1) * 2; i++){
                System.out.print(" ");
            }
            System.out.println("\\");
        }

        for(int line = 1; line <= edge; line++){
            for(int i = 0; i <= line - 1; i++){
                System.out.print(" ");
            }
            System.out.print("\\");
            for(int i = 0; i <= (edge - line) * 2; i++){
                System.out.print(" ");
            }
            System.out.println("/");
        }

        input.close();
    }
}
