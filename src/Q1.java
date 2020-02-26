public class Q1 {

    public int[] calculCarre(int a, int b){

        int[] tab = new int[];
        int i =0;

        for (int x =a ; x<=b ; x++){

            tab[i] = (int) Math.sqrt(x) ;
            i++;

        }
        return tab ;
    }



}
