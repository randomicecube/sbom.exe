package foo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BasicMathTest {
    @Test
    void test_add() {
        assertEquals(4, BasicMath.add(23,2));
    }
}
