import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {


    protected Triangle t;

    @BeforeEach
    void setUp() {
    t= new Triangle() ;
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void typeTriangle() {

        assertEquals("Equilateral", t.TypeTriangle(1,1,1));

        assertEquals("Isocele", t.TypeTriangle(2,3.16,3.16));

        assertEquals("Rectangle", t.TypeTriangle(8,6,10));

    }
}