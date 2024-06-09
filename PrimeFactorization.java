package tools;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
    	
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        
        int number = scanner.nextInt();
        
        scanner.close();

        System.out.println("Prime factors of " + number + "are:");
        
        for (Integer factor : primeFactors(number)) {
        	
            System.out.println(factor);
        }
    }
    }