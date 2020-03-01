import java.util.Scanner;

public class Q1 {

    private static Scanner scanner = new Scanner(System.in);

    public static int[] calculCarre(int a, int b){
        if (b>=0 && a>=0) {
            int min = Math.min(a,b);
            int max = Math.max(a,b);

            int[] tab = new int[max - min + 1];
            int i = 0;


            for (int x = min; x <= max; x++) {
                tab[i] = (int) Math.round(Math.sqrt(x));
                i++;

            }
            return tab;
        }
        return new int[]{};
    }


    public static void main(String[] args){
        int a,b;

        System.out.println("Inserez deux int: ");
        a = scanner.nextInt();
        b = scanner.nextInt();

        int[] t = Q1.calculCarre(a,b);

        if (t.length==0) System.out.println("Erreur");
        else for(int x : t) System.out.println(x);


    }
}
