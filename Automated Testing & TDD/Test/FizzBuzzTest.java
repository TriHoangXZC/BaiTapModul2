import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    @DisplayName("Chia hết cho 3")
    void displayFizzBuzz() {
        int number = 6;
        String expected = "Fizz";
        String result = FizzBuzz.displayFizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Chia hết cho 5")
    void displayFizzBuzz1() {
        int number = 5;
        String expected = "Buzz";
        String result = FizzBuzz.displayFizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Chia hết cho 3 và 5")
    void displayFizzBuzz2() {
        int number = 15;
        String expected = "FizzBuzz";
        String result = FizzBuzz.displayFizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Không chia hết cho số nào")
    void displayFizzBuzz3() {
        int number = 4;
        String expected = "4";
//        String expected = "Bốn";
        String result = FizzBuzz.displayFizzBuzz(number);
        assertEquals(expected, result);
    }
}