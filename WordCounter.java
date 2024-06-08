package tools;

import java.util.Scanner;

public class WordCounter {

    /**
     * This method counts the number of words in a given paragraph.
     * @param paragraph The input paragraph as a string.
     * @return The number of words in the paragraph.
     *
     */
    public static int countWordsInParagraph(String paragraph) {
        // Check if the paragraph is null or empty
        if (paragraph == null || paragraph.trim().isEmpty()) {
            return 0;
        }

        // Split the paragraph into words using whitespace as delimiter
        String[] words = paragraph.split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a paragraph
        System.out.println("Please enter the paragraph:");

        // Read the paragraph input from the user
        String inputParagraph = scanner.nextLine();

        // Count the number of words in the paragraph and print the result
        int wordCount = countWordsInParagraph(inputParagraph);
        System.out.println("Number of words in the paragraph: " + wordCount);
    }
}
