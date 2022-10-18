import java.util.Scanner;

public class Spoj_2 {
    public static void main(String[] args) {
        int n, m;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        //new list S
        int[] S = new int[n];
        for (int i = 0; i < n; i++) {
            S[i] = in.nextInt();
        }

        // new list Q
        m = in.nextInt();
        int[] Q = new int[m];
        for (int i = 0; i < m; i++) {
            Q[i] = in.nextInt();
        }

        // print elements from S that are not in Q
        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = 0; j < m; j++) {
                if (S[i] == Q[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.print(S[i] + " ");
            }
        }
    }
}
