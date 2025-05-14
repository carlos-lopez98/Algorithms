package org.example.recursion;

public class MyPow {
    private double binaryExp(double x, long n) {
        // Base case, to stop recursive calls.
        if (n == 0) {
            return 1;
        }

        // Handle case where, n < 0.
        if (n < 0) {
            return 1.0 / binaryExp(x, -1 * n);
        }

        // Perform Binary Exponentiation.
        // If 'n' is odd we perform Binary Exponentiation on 'n - 1' and multiply result with 'x'.
        double half = binaryExp(x, n / 2);

        if (n % 2 == 1) {
            return x * half * half;
        }
        // Otherwise we calculate result by performing Binary Exponentiation on 'n'.
        else {
            return half * half;
        }
    }

    public double myPow(double x, int n) {

        //Converting to long to handle lengths longer than int
        return binaryExp(x, (long) n);
    }
}
