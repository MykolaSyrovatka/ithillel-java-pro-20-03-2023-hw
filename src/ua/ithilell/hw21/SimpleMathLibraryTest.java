package ua.ithilell.hw21;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleMathLibraryTest {
    SimpleMathLibrary simpleMathLibrary = new SimpleMathLibrary();

    @Test
    void addTest() {
        Assertions.assertEquals(3, simpleMathLibrary.add(1,2));
        Assertions.assertEquals(-3, simpleMathLibrary.add(-1, -2));
        Assertions.assertEquals(1, simpleMathLibrary.add(-1,2));
        Assertions.assertEquals(-1, simpleMathLibrary.add(1,-2));
    }

    @Test
    void minusTest() {
        Assertions.assertEquals(-1, simpleMathLibrary.minus(1,2));
        Assertions.assertEquals(1, simpleMathLibrary.minus(-1, -2));
        Assertions.assertEquals(-3, simpleMathLibrary.minus(-1,2));
        Assertions.assertEquals(3, simpleMathLibrary.minus(1,-2));
    }
}