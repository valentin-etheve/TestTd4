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

        // test avec majuscule
        String t1 = "Suus";
        assertEquals(true, pal.isPalindrome((t1)));


    }

    @Test
    void splitPalindromeIntoWords() {

        String t = "je suis 4 mots" ;

        assertArrayEquals(new String[] {"je", "suis", "4", "mots"} , pal.splitPalindromeIntoWords(t));


        String t2 = "je suis : 4 mots";

        assertArrayEquals(new String[]{"je", "suis", ":", "4", "mots"}, pal.splitPalindromeIntoWords(t2));



    }

    @Test
    void nbPalindrome(){
        String s = "je suus un palindrome, de la street";

        assertEquals(1, pal.nbPalindrome(s));
    }
}