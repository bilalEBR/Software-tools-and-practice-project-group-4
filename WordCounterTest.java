package tools;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordCounterTest {

    /**
     * This test method validates the word count functionality
     * of the WordCounter class.
     */
    @Test
    public void testCountWordsInParagraph() {
        // Test with a simple paragraph
        String paragraph1 = "This is a simple paragraph.";
        int expectedCount1 = 5;
        assertEquals(expectedCount1, WordCounter.countWordsInParagraph(paragraph1));

        // Test with another paragraph with more words
        String paragraph2 = "This is another paragraph with more words.";
        int expectedCount2 = 7;
        assertEquals(expectedCount2, WordCounter.countWordsInParagraph(paragraph2));

        // Test with an empty paragraph
        String paragraph3 = "  ";
        int expectedCount3 = 0;
        assertEquals(expectedCount3, WordCounter.countWordsInParagraph(paragraph3));

        // Test with a null paragraph
        String paragraph4 = null;
        int expectedCount4 = 0;
        assertEquals(expectedCount4, WordCounter.countWordsInParagraph(paragraph4));
    }
}
