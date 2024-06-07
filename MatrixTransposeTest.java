
package tools;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MatrixTransposeTest {

   @Test
   void testTransposeMatrix() {
       int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
       int[][] expectedTransposedMatrix = {{1, 4}, {2, 5}, {3, 6}};
       int[][] actualTransposedMatrix = MatrixTranspose.transposeMatrix(matrix);
       assertArrayEquals(expectedTransposedMatrix, actualTransposedMatrix);
   }
}

