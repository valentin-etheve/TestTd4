import java.util.Random;

public class Q2 {

    public static int[][] matrice(int m,int n,int a,int b){

        int min, max ;

        if(a<b){
            min =a ;
            max =b;
        } else {
            min = b;
            max =a;
        }

        Random r = new Random();


        int[][] tab = new int [m][n] ;

        for (int i =0 ; i<m; i++){
            for (int j=0 ; j<n ; j++){
                int valeur = min + r.nextInt(max - min);
                tab[i][j] =  valeur ;
            }
        }
        return tab;

    }

    public static void main(String[] args){

        int[][] tab = Q2.matrice(3,4,10,30);

        int j =0;
        for (int i = 0; i<3;i++){
            System.out.println(tab[i][0] + " "+ tab[i][1] + " "+ tab[i][2] + " "+ tab[i][3] );
        }

    }
}
