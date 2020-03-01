import java.util.Scanner;

public class Palindrome {
    private static Scanner scanner = new Scanner(System.in);

    /*public static void main (String[] args) {
        int total=0;


        System.out.println("Ecrivez une phrase (avec des palindromes) : ");
        String palindrome = scanner.nextLine();


        String[] arrayPalindrome = splitPalindromeIntoWords(palindrome);

        for (String word : arrayPalindrome) {
            if(word != "." || word != ":" || word != ";" || word != "!" || word != "?"){
                if (isPalindrome(word)) {
                    total++;
                }
            }
        }

        System.out.println(total);
    }*/

    public static boolean isPalindrome(String palindrome) {
        palindrome = palindrome.toLowerCase();
        String palindromeInverse = "";
        int i=palindrome.length()-1;

        while (i>=0) palindromeInverse += palindrome.charAt(i--);

        return palindrome.equals(palindromeInverse);
    }

    public static String[] splitPalindromeIntoWords(String palindrome) {
        String aa = palindrome;

        return aa.split(" ");
    }


    public static int nbPalindrome(String pal){

        int total=0;
        String[] arrayPalindrome = splitPalindromeIntoWords(pal);

        for (String word : arrayPalindrome) {
            if(word != "." || word != ":" || word != ";" || word != "!" || word != "?" || word != "," || word != " "){
                if (isPalindrome(word)) {
                    total++;
                }
            }
        }
        return total;

    }
}
