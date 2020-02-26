import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q1Test {
    protected Q1 q;

    @BeforeEach
    void setUp() {
        q = new Q1();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void calculCarre() {
        assertArrayEquals(new int[]{1, 1, 2, 2, 2}, q.calculCarre(1, 5));
        // assert exception if number is negative or a > b
    }
}