import java.util.Random;
import java.util.Scanner;

public class Q2 {
    private static Scanner scanner = new Scanner(System.in);

    public static int[][] matrice(int m,int n,int a,int b){
        if (m>0 && n>0) {
            int min = Math.min(a, b);
            int max = Math.max(a, b);

            int[][] tab = new int[m][n];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    tab[i][j] = random(min,max);
                }
            }
            return tab;
        }
        return new int[][]{};
    }

    public static int random(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }

    public static void main(String[] args){
        int M,N,A,B;

        System.out.println("Entrez une matrice de taille : M * N");
        M = scanner.nextInt();
        N = scanner.nextInt();
        System.out.println("Entrez une intervalle pour les nombres aléatoires (entre A et B)");

        A = scanner.nextInt();
        B = scanner.nextInt();
        int[][] tab = Q2.matrice(M,N,A,B);

        if (tab.length==0) System.out.println("Erreur, pas de valeur négative");
        for (int i = 0; i<tab.length;i++) {
            System.out.println("");
            for (int j = 0; j < tab[0].length; j++) System.out.print(tab[i][j]+"\t");
        }
    }
}
