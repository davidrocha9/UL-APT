import java.util.Scanner;

public class Spoj_4 {
    // reverse string
    public static String reverse(String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = 0;
        for (int x=0; x < n; x++)
        {
            result = 0;
            for (int y = 0; y < 2; y++) {
                result += Integer.parseInt(reverse(in.next()));
            }
            System.out.println(Integer.parseInt(reverse(String.valueOf(result))));
        }
    }
}
