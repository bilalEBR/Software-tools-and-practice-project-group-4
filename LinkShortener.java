



package tools;

import java.util.HashMap;
import java.util.Map;

public class LinkShortener {
	
    private Map<String, String> shortToLongUrlMap;
    private Map<String, String> longToShortUrlMap;
    private static final String BASE_URL = "https://short.url/";

    public LinkShortener() {
        this.shortToLongUrlMap = new HashMap<>();
        this.longToShortUrlMap = new HashMap<>();
    }
    

    
    public String shortenUrl(String longUrl) {
        if (longToShortUrlMap.containsKey(longUrl)) {
            return longToShortUrlMap.get(longUrl);
            
        }

        String shortUrl = generateShortUrl();
        shortToLongUrlMap.put(shortUrl, longUrl);
        longToShortUrlMap.put(longUrl, shortUrl);
        return shortUrl;
    }

    public String expandUrl(String shortUrl) {
        return shortToLongUrlMap.getOrDefault(shortUrl, "Short URL does not exist");
    }

    private String generateShortUrl() {
        // Generated a short URL based on some logic
        return BASE_URL + (int)(Math.random() * 1000);
    }

    public static void main(String[] args) {
        LinkShortener linkShortener = new LinkShortener();

        String longUrl = "https://www.google.com/search?q=link+shortener+java+program&oq=link+shortener+java+program&gs_lcrp=EgZjaHJvbWUyBggAEEUYOTIHCAEQIRiPAtIBCTIwMTY2ajBqN6gCCLACAQ&sourceid=chrome&ie=UTF-8#fpstate=ive&vld=cid:57066797,vid:r13QVsIhlNU,st:0";
        String shortUrl = linkShortener.shortenUrl(longUrl);
        System.out.println("Shortened URL: " + shortUrl);

       
    }
}