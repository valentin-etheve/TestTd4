public class Q1 {

    public static int[] calculCarre(int a, int b){

        int[] tab = new int[50];
        int i = 0;

        for (int x =a ; x<=b ; x++){

            tab[i] = (int) Math.sqrt(x) ;
            i++;

        }
        return tab ;
    }


public static void main(String[] args){

    int[] t = Q1.calculCarre(2,5);

    for(int x : t){
        System.out.println(x);
    }

}


}
