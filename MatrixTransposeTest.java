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

    @Test
    void testSquareMatrix() {
        int[][] squareMatrix = {{1, 2}, {3, 4}};
        int[][] expectedTransposedSquareMatrix = {{1, 3}, {2, 4}};
        int[][] actualTransposedSquareMatrix = MatrixTranspose.transposeMatrix(squareMatrix);
        assertArrayEquals(expectedTransposedSquareMatrix, actualTransposedSquareMatrix);
    }

    @Test
    void testSingleRowMatrix() {
        int[][] singleRowMatrix = {{1, 2, 3, 4}};
        int[][] expectedTransposedSingleRowMatrix = {{1}, {2}, {3}, {4}};
        int[][] actualTransposedSingleRowMatrix = MatrixTranspose.transposeMatrix(singleRowMatrix);
        assertArrayEquals(expectedTransposedSingleRowMatrix, actualTransposedSingleRowMatrix);
    }

    @Test
    void testSingleColumnMatrix() {
        int[][] singleColumnMatrix = {{1}, {2}, {3}, {4}};
        int[][] expectedTransposedSingleColumnMatrix = {{1, 2, 3, 4}};
        int[][] actualTransposedSingleColumnMatrix = MatrixTranspose.transposeMatrix(singleColumnMatrix);
        assertArrayEquals(expectedTransposedSingleColumnMatrix, actualTransposedSingleColumnMatrix);
    }
}
