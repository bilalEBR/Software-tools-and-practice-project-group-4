package tools;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeFactorization {

    /**
     * Method to calculate the prime factors of a given number.
     *
     * @param number The number to factorize.
     * @return A list of prime factors.
     */
    public static List<Integer> getPrimeFactors(int number) {
        int tempNumber = number;
        List<Integer> factors = new ArrayList<>();

        // Start checking for factors from 2 upwards
        for (int i = 2; i <= tempNumber / i; i++) {
            while (tempNumber % i == 0) {
                factors.add(i);
                tempNumber /= i;
            }
        }

        // If there's any prime factor greater than sqrt(number), it will be tempNumber itself.
        if (tempNumber > 1) {
            factors.add(tempNumber);
        }

        return factors;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        // Get the prime factors of the entered number
        List<Integer> primeFactors = getPrimeFactors(number);

        // Display the prime factors
        System.out.println("Prime factors of " + number + ":");
        for (Integer factor : primeFactors) {
            System.out.println(factor);
        }
    }
}
