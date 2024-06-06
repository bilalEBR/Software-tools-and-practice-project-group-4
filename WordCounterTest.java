package tools;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordCounterTest {

    /**
     * This test method uses parameterized tests to validate the word count functionality
     * of the WordCounter class.
     * @param paragraph The input paragraph as a string.
     * @param expectedCount The expected number of words in the paragraph.
     */
    @SuppressWarnings("static-access")
    @ParameterizedTest
    @CsvSource({
            "This is a simple paragraph, 5",
            "This is another paragraph with more words, 7",
            // Test case for an empty paragraph
            "  , 0"
    })
    @Test
    public void testWordCountInParagraph(String paragraph, int expectedCount) {
        WordCounter wordCounter = new WordCounter();
        // Assert that the countWordsInParagraph method returns the expected word count
        assertEquals(expectedCount, wordCounter.countWordsInParagraph(paragraph));
    }
}
