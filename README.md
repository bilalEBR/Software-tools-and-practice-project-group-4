 # Software-Tools-And-Practice-Project-Group-4<br>

---

# Java Programs Overview

This README provides an introduction to several Java programs along with their associated JUnit tests. Each program serves a specific purpose and is accompanied by sample code demonstrating its functionality. The programs covered in this README are:

1. **Link Shortener**
2. **Transpose of Matrix**
3. **Pharmacy Managment System**
4. **Prime Factorization Calculator**
5. **Word Counter**


For each program, both the implementation code and its corresponding JUnit test code are provided to showcase how the functionalities work and how they can be tested.

---
#### 1. Link Shortener
- **Description:**
  The "Link Shortener" program shortens long URLs into shorter, more manageable links. It generates unique short links for provided URLs using an algorithm or mapping mechanism and allows users to use the shortened link to redirect to the original URL.


- Junit Test Sample Code:
  ```java
          
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
  ```

  #### 3. Pharmacy Drug Record CRUD Console Application
- Description:
  The "Pharmacy Drug Record CRUD Console Application" is a Java console-based application that manages drug records in a pharmacy. It supports Create, Read, Update, and Delete (CRUD) operations for drug records, with each operation encapsulated in a separate method for structured data management.

- Sample Code:
  ```java
  // Method to update an existing drug record
    protected static void updateDrugRecord(String oldDrugName, String newDrugName) {
        int index = drugRecords.indexOf(oldDrugName);
        if (index >= 0 && index < drugRecords.size()) {
            drugRecords.set(index, newDrugName);
            System.out.println("Drug record updated successfully.");
        } else {
            System.out.println("Drug record not found. Update failed.");
        }
    }
  ```

- JUnit Test Sample Code:
  ```java
  public class PharmacyManagementSystemTest {

    @Test
    void testAddDrugRecord() {
        PharmacyManagementSystem.drugRecords.clear(); 
        PharmacyManagementSystem.addDrugRecord("Paracetamol");
        assertEquals(1, PharmacyManagementSystem.drugRecords.size());
        assertTrue(PharmacyManagementSystem.drugRecords.contains("Paracetamol"));
    }
    }
  ```



#### 2. Transpose of Matrix
- **Description:**
  The "Transpose of Matrix" program in Java calculates the transpose of a given matrix. It swaps the rows and columns of the matrix to produce a new matrix where the rows of the original matrix become the columns of the new matrix.

  - Sample Code:
  ```java


    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposedMatrix = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        return transposedMatrix;
    }

- Junit Test Sample Code:
  ```java
  public class MatrixTransposeTest {

    @Test
    void testTransposeMatrix() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        int[][] expectedTransposedMatrix = {{1, 4}, {2, 5}, {3, 6}};
        int[][] actualTransposedMatrix = MatrixTranspose.transposeMatrix(matrix);
        assertArrayEquals(expectedTransposedMatrix, actualTransposedMatrix);
    }
    }
  ```

  #### 3. Pharmacy Drug Record CRUD Console Application
- Description:
  The "Pharmacy Drug Record CRUD Console Application" is a Java console-based application that manages drug records in a pharmacy. It supports Create, Read, Update, and Delete (CRUD) operations for drug records, with each operation encapsulated in a separate method for structured data management.

- Sample Code:
  ```java
  public class PharmacyManagementSystem {
      // Method to add a new drug record
    public static void addDrugRecord(String drugName) {
        drugRecords.add(drugName);
        System.out.println("Drug record added successfully: " + drugName);
    }

  }
  ```

- JUnit Test Sample Code:
  ```java
  public class PharmacyManagementSystemTest {

      @Test
      void testAddDrugRecord() {
          PharmacyManagementSystem.drugRecords.clear(); 
          PharmacyManagementSystem.addDrugRecord("Paracetamol");
          assertEquals(1, PharmacyManagementSystem.drugRecords.size());
          assertTrue(PharmacyManagementSystem.drugRecords.contains("Paracetamol"));
      }
  }
  ```
  





#### 4. Prime Factorization Calculator
- **Description:**
  The "Prime Factorization Calculator" program calculates the prime factors of a given number. It decomposes the input number into its prime factors, listing each prime factor with its corresponding power. The output provides a comprehensive factorization of the input number. 
  - JUnit Test Sample Code:
  ```java

  public class PrimeFactorizationTest {

    @Test

    public void testPrimeFactors() {
    	
        assertEquals(listOf(2, 2, 5, 5), PrimeFactorization.primeFactors(100));
        assertEquals(listOf(2, 2, 2, 5,5,5), PrimeFactorization.primeFactors(1000));
    }
    }
 ```

#### 5. Word Counter from Input of Paragraph
 - **Description:**
      The "Word Counter" program counts the occurrences of each word in a paragraph input by the user. It processes the input paragraph, extracts individual words, and counts their frequencies. The output displays the word count of each unique word in the paragraph.
      - Sample Code:
      
      ```java

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
      }

  ```
  # Contrbuters 



|NO | Name            |ID Number|User Name|  
|:--| :---------------|---------|---------|
|1. |Hailemichael Abayneh  | WDU 146297  |[@MichaelAbayneh](https://github.com/michaelabayneh)
|2. |Bilal   Ebrahim | WDU  145647 |[@bilalEBR](https://github.com/bilalEBR)
|3. |Tiena  Abebaw |WDU 147400 |[@tenaabebaw](https://github.com/tenaabebaw)
|4. |Sulyman  Abdu   |WDU 147312  |[@suleyman0931](https://github.com/suleyman0931)
|5. |Yabsera  Asefaw  |WDU 147548  |[@yab-asfaw](https://github.com/yab-asfaw)
|6. |Elias    Nibret  |WDU 145962  |[@eliasgebru](https://github.com/eliasgebru)







