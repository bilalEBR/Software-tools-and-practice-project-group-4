
package tools;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorization {
    public static List<Integer> primeFactors(int number) {
        int n = number;
        List<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= n / i; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        if (n > 1) {
            factors.add(n);
        }
        return factors;
    }

    public static void main(String[] args) {
        System.out.println("Prime factors of 100 are :");
        for (Integer factor : primeFactors(100)) {
            System.out.println(factor);
        }
    }
}

