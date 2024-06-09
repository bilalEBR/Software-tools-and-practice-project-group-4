 # Software-Tools-And-Practice-Project-Group-4<br>

---

# Java Programs Overview

This README provides an introduction to several Java programs along with their associated JUnit tests. Each program serves a specific purpose and is accompanied by sample code demonstrating its functionality. The programs covered in this README are:

1. **Transpose of Matrix**
2. **Word Counter**
3. **Link Shortener**
4. **Prime Factorization Calculator**
5. **Pharmacy Drug Record CRUD Console Application**

For each program, both the implementation code and its corresponding JUnit test code are provided to showcase how the functionalities work and how they can be tested.

---

#### 1. Transpose of Matrix
- **Description:**
  The "Transpose of Matrix" program in Java calculates the transpose of a given matrix. It swaps the rows and columns of the matrix to produce a new matrix where the rows of the original matrix become the columns of the new matrix.


- Juit Test Sample Code:
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

  
#### 2. Word Counter from Input of Paragraph
- **Description:**
  The "Word Counter" program counts the occurrences of each word in a paragraph input by the user. It processes the input paragraph, extracts individual words, and counts their frequencies. The output displays the word count of each unique word in the paragraph.
  - Sample Code:
  ```java
  public class WordCounter {
	public static int countWords(String paragraph ){
        if (paragraph == null || paragraph.trim().isEmpty()) {
            return 0;
        }

        String[] words = paragraph.split("\\s+");
        return words.length;
    }
	
	public static void main(String []args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Write the paragraph here");
		String paragraph=sc.nextLine();
		System.out.println(countWords(paragraph));
		
	}
  }

  ```

#### 3. Link Shortener
- **Description:**
  The "Link Shortener" program shortens long URLs into shorter, more manageable links. It generates unique short links for provided URLs using an algorithm or mapping mechanism and allows users to use the shortened link to redirect to the original URL.



#### 4. Prime Factorization Calculator
- **Description:**
  The "Prime Factorization Calculator" program calculates the prime factors of a given number. It decomposes the input number into its prime factors, listing each prime factor with its corresponding power. The output provides a comprehensive factorization of the input number. 
  
#### 5. Pharmacy Drug Record CRUD Console Application
- Description:
  The "Pharmacy Drug Record CRUD Console Application" is a Java console-based application that manages drug records in a pharmacy. It supports Create, Read, Update, and Delete (CRUD) operations for drug records, with each operation encapsulated in a separate method for structured data management.

- Sample Code:
  ```java
  public class PharmacyManagementSystem {
     public static void AddDrugRecord(String drugName) {
       
        drugRecords.add(drugName);
        System.out.println("Drug record added successfully: " + drugName);
    }

  }
  ```

- JUnit Test Sample Code:
  ```java
  public class PharmacyAppParametrizedTest {

    @SuppressWarnings("static-access")
	@ParameterizedTest
    @CsvSource({
            "Paracetamol",
            "Ibuprofen",
            "Aspirin"
    })
    void testCreateDrugRecord(String drugName) {
        PharmacyApp pharmacyApp = new PharmacyApp();
        PharmacyApp.createDrugRecord(drugName);
        
        assertTrue(pharmacyApp.drugRecords.contains(drugName));
    }
    }
  ```
   <br><br><br><br>
  # Contrbuters 



|NO | Name            |ID Number|User Name|  
|:--| :---------------|---------|---------|
|1. |Hailemichael Abayneh  | WDU 146297  |[@MichaelAbayneh](https://github.com/michaelabayneh)
|2. |Bilal   Ebrahim | WDU  145647 |[@bilalEBR](https://github.com/bilalEBR)
|3. |Tiena  Abebaw |WDU 147400 |[@tenaabebaw](https://github.com/tenaabebaw)
|4. |Sulyman  Abdu   |WDU 147312  |[@suleyman0931](https://github.com/suleyman0931)
|5. |Yabsera  Asefaw  |WDU 147548  |[@yab-asfaw](https://github.com/yab-asfaw)
|6. |Elias    Nibret  |WDU 145962  |[@eliasgebru](https://github.com/eliasgebru)

<br><br><br><br>

If you have any inquiries, encounter issues, or require assistance with the Java project, please feel free to reach out through the following channels:

- For general support and queries, you can contact us via email at [abenimom1994@gmail.com](abenimom1994@gmail.com)<br>[etumesi@gmail.com]([etumesi@gmail.com).
- To report any bugs, suggest enhancements, or submit feedback, please open an issue on our GitHub repository: [Project Repository Issues](https://github.com/abenezerTariku/software-tools-and-practice-project-group-4/issues).
- Connect with the project community and seek help by joining our discussion forums or chat platforms linked in the project documentation.



