import java.util.Scanner;

public class Spoj_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int trailing_zeros, number;
        for (int x = 0; x < n; x++)
        {
            number = in.nextInt();
            trailing_zeros = 0;
            while (number > 0)
            {
                trailing_zeros = trailing_zeros + (number / 5);
                number = number / 5;
            }
            System.out.println(trailing_zeros);
        }
    }
}
