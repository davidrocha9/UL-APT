import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Spoj_3 {
    private static BigInteger factorial(int n)
    {
        if (n == 0) {
            return BigInteger.ONE;
        }
        else
        {
            return BigInteger.valueOf(n).multiply(factorial(n - 1));
        }
    }

    public static void main (String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int test_cases = Integer.parseInt(bf.readLine());
        for(int x=0 ;x<test_cases ;x++)
        {
            System.out.println(factorial(Integer.parseInt(bf.readLine())));
        }
    }
}
