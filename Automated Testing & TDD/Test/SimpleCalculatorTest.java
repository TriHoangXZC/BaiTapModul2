import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleCalculatorTest {
    @Test
    @DisplayName("Testing addition 17 + 8")
    public void testAddition1And1() {
        int first = 17;
        int second = 8;
        int expected = 25;
        int result = SimpleCalculator.add(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing addition 0 + 1")
    public void testAddition0And1() {
        int first = 0;
        int second = 1;
        int expected = 1;
        int result = SimpleCalculator.add(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing addition 1 + 0")
    public void testAddition1And0() {
        int first = 1;
        int second = 0;
        int expected = 1;
        int result = SimpleCalculator.add(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing addition 0 + 0")
    public void testAddition0And0() {
        int first = 0;
        int second = 0;
        int expected = 0;
        int result = SimpleCalculator.add(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing Sub 0 - 0")
    public void testSub0And0() {
        int first = 0;
        int second = 0;
        int expected = 0;
        int result = SimpleCalculator.sub(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing Sub 0 - 1")
    public void testSub0And1() {
        int first = 0;
        int second = 1;
        int expected = -1;
        int result = SimpleCalculator.sub(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing Sub 1 - 0")
    public void testSub1And0(){
        int first = 1;
        int second = 0;
        int expected = 1;
        int result = SimpleCalculator.sub(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing Sub 3 - 6")
    public void testSub3And6(){
        int first = 3;
        int second = 6;
        int expected = -3;
        int result = SimpleCalculator.sub(first, second);
        assertEquals(expected, result);
    }
}