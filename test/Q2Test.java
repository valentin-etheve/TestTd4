import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q2Test {

    protected Q2 q2;

    @BeforeEach
    void setUp() {
        q2 = new Q2();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void matrice() {
        assertArrayEquals(new int[][]{}, q2.matrice(-1,-1,0,1));
        assertArrayEquals(new int[][]{}, q2.matrice(-1,0,3,1));
    }
}