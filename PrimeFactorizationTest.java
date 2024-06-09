package tools;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;
import java.util.ArrayList;

public class PrimeFactorizationTest {

    @Test
    public void testGetPrimeFactors() {
        // Test with number 100
        assertEquals(listOf(2, 2, 5, 5), PrimeFactorization.getPrimeFactors(100));

        // Additional test cases for coverage
        assertEquals(listOf(2, 3), PrimeFactorization.getPrimeFactors(6));
        assertEquals(listOf(3, 3, 11), PrimeFactorization.getPrimeFactors(99));
        assertEquals(listOf(7, 11), PrimeFactorization.getPrimeFactors(77));
        assertEquals(listOf(13), PrimeFactorization.getPrimeFactors(13));
        assertEquals(listOf(2, 2, 2, 2, 2, 2), PrimeFactorization.getPrimeFactors(64));
    }

    // Helper method to create a list from varargs
    private List<Integer> listOf(Integer... values) {
        List<Integer> list = new ArrayList<>();
        for (Integer value : values) {
            list.add(value);
        }
        return list;
    }
}
