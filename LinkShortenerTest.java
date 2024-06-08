


package tools;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkShortenerTest {

    @Test
    public void testShortenAndExpandUrl() {
        LinkShortener linkShortener = new LinkShortener();
        String longUrl = "https://www.example.com";

        String shortUrl = linkShortener.shortenUrl(longUrl);
        String expandedUrl = linkShortener.expandUrl(shortUrl);

        assertEquals(longUrl, expandedUrl);
    }
}
