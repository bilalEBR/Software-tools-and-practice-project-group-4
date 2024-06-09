package tools;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkShortenerTest {

    @Test
    public void testShortenAndExpandUrl() {
        LinkShortener linkShortener = new LinkShortener();
        String originalLongUrl = "https://www.example.com";

        String generatedShortUrl = linkShortener.shortenUrl(originalLongUrl);
        String retrievedLongUrl = linkShortener.expandUrl(generatedShortUrl);

        assertEquals(originalLongUrl, retrievedLongUrl);
    }
}
