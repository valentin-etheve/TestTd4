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

    public static String TypeTriangle (double a, double b, double c) {

        String t ="pas un triangle";

        if (a==b && b==c && c==a) {
            t = "Equilateral";
        }

         if(a==b || a==c){
            if(b!=c){
                t= "Isocele";
            }
        } else if(b==a || b==c){
            if(a!=c){
                t= "Isocele";
            }
        }else if(c==a || c==b){
            if(a!=b){
                t= "Isocele";
            }
        }

        double max =0;
         double c1 =0;
         double c2 = 0;

        if(a<b){
            max = b;
            c1 = a;
        }else {
            max =a;
            c1=b;
        }

        if(max<c){
            c2 = max;
            max = c;
        }else {
            c2 = c;
        }

        if(max*max == (c1*c1 + c2*c2)){
            t= "Rectangle";
        }
        return t;


    }



}
