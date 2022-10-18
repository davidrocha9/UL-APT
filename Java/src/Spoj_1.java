import java.util.Scanner;

public class Spoj_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            String input = in.nextLine();
            if (input.equals("42")) {
                break;
            }
            System.out.println(input);
        }
    }
}