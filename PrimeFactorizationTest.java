package tools;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;
import java.util.ArrayList;

public class PrimeFactorizationTest {

    @Test
    public void testPrimeFactors() {
        assertEquals(listOf(2, 2, 5, 5), PrimeFactorization.primeFactors(100));
     
    }

   
    private List<Integer> listOf(Integer... values) {
        List<Integer> list = new ArrayList<>();
        for (Integer value : values) {
            list.add(value);
        }
        return list;
    }
}