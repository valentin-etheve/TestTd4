import java.lang.reflect.Type;
import java.util.Scanner;

public class Triangle {
    private static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args) {
        int a,b,c;

        System.out.println("Ecrivez trois valeurs représentant les côtés d'un triangle : ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        System.out.println(TypeTriangle(a,b,c));

    }

    public static String TypeTriangle (int a, int b, int c) {
        if ((a>0 && b>0 && c>0) && a + b > c || a + c > b || b + c > a) {
            if (a - b - c == -a) return "Equilateral";
            else if ((a - b == 0 && a != c) || (a - c == 0 && a != b)) return "Isocele";
            else return "Scalene";
        }
        else return "Pas un triangle";
    }

}
