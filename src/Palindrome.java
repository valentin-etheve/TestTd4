import java.util.Scanner;

public class Palindrome {
    private static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args) {
        int total=0;


        System.out.println("Ecrivez une phrase (avec des palindromes) : ");
        String palindrome = scanner.nextLine();


        String[] arrayPalindrome = splitPalindromeIntoWords(palindrome);

        for (String word : arrayPalindrome) { if (isPalindrome(word)) total++; }

        System.out.println(total);
    }

    public static boolean isPalindrome(String palindrome) {
        String palindromeInverse = "";
        int i=palindrome.length()-1;

        while (i>=0) palindromeInverse += palindrome.charAt(i--);

        return palindrome.equals(palindromeInverse);
    }

    public static String[] splitPalindromeIntoWords(String palindrome) {
        String aa = palindrome;

        aa=aa.replace(".", " ");
        aa=aa.replace(",", " ");
        aa=aa.replace(";", " ");
        aa=aa.replace(":", " ");
        aa=aa.replace("!", " ");
        aa=aa.replace("?", " ");

        return aa.split(" ");
    }
}
