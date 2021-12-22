import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {
    @Test
    @DisplayName("Tam giác đều")
    void testTypeTriangle() {
        double firstNumber = 2;
        double secondNumber = 2;
        double thirdNumber = 2;
        String expected = "Tam giác đều";
        String result = TriangleClassifier.classifierTriangle(firstNumber, secondNumber, thirdNumber);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Tam giác cân")
    void testTypeTriangle1() {
        double firstNumber = 2;
        double secondNumber = 2;
        double thirdNumber = 3;
        String expected = "Tam giác cân";
        String result = TriangleClassifier.classifierTriangle(firstNumber, secondNumber, thirdNumber);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Tam giác thường")
    void testTypeTriangle2() {
        double firstNumber = 3;
        double secondNumber = 4;
        double thirdNumber = 5;
        String expected = "Tam giác thường";
        String result = TriangleClassifier.classifierTriangle(firstNumber, secondNumber, thirdNumber);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Không phải tam giác")
    void testTypeTriangle3() {
        double firstNumber = 8;
        double secondNumber = 2;
        double thirdNumber = 3;
        String expected = "Không phải tam giác";
        String result = TriangleClassifier.classifierTriangle(firstNumber, secondNumber, thirdNumber);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Không phải tam giác")
    void testTypeTriangle4() {
        double firstNumber = -1;
        double secondNumber = 2;
        double thirdNumber = 1;
        String expected = "Không phải tam giác";
        String result = TriangleClassifier.classifierTriangle(firstNumber, secondNumber, thirdNumber);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Không phải tam giác")
    void testTypeTriangle5() {
        double firstNumber = 0;
        double secondNumber = 1;
        double thirdNumber = 1;
        String expected = "Không phải tam giác";
        String result = TriangleClassifier.classifierTriangle(firstNumber, secondNumber, thirdNumber);
        assertEquals(expected, result);
    }
}