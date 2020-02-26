import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    protected Palindrome pal;

    @BeforeEach
    void setUp() {
        pal = new Palindrome();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void isPalindrome() {

        String t = "suus" ;

        assertEquals(true, pal.isPalindrome(t));



    }

    @Test
    void splitPalindromeIntoWords() {

        String t = "je suis 4 mots" ;

        assertArrayEquals(new String[] {"je", "suis", "4", "mots"} , pal.splitPalindromeIntoWords(t));


            String t2 = "je suis : 4 mots";

            assertArrayEquals(new String[]{"je", "suis", "4", "mots"}, pal.splitPalindromeIntoWords(t2));

    }
}