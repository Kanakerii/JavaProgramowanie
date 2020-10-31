import java.lang.reflect.Array;
import java.util.Arrays;

public class Zadanie8 {
    public static void main(String[] args) {
        int[][]tab=new int[3][3];
        for (int i = 0; i < tab.length; i++) {
            System.out.println();
            for (int j = 0; j < tab.length; j++) {
                tab[i][j]=(int)(Math.random()*(99-10)+10);
                System.out.print(tab[i][j] +", ");
            }
        }
        System.out.println();
        for (int i = 0; i < tab.length; i++) {
            int suma=0;
            for (int j = 1; j < tab.length; j++) {
                suma+=tab[i][j];

            }
            System.out.println("Suma dla tablicy o indexie: "+i);
            System.out.println(suma);

        }

    }
}
