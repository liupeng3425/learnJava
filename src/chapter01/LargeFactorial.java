package chapter01;

import java.math.BigInteger;

/**
 * Created by Peng on 2016/1/28.
 * using math.BigInteger to calculate a very big number.
 */
public class LargeFactorial {
    public static void main(String[] args) {
        final int n = 12;
        System.out.println(n + "! is \n" + factorial(n));
    }

    private static BigInteger factorial(long n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(new BigInteger(i + ""));
        }
        return result;
    }
}
