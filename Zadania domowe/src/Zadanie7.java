import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy");
        int a= scan.nextInt();
        int naj=0;
        int temp=0;
        int[]tab=new int[a];
        System.out.println("Podaj liczby w tablicy");
        for (int i = 0; i < tab.length; i++) {
            System.out.println((i+1)+" Liczba: ");
            a= scan.nextInt();
            tab[i]=a;
        }
        for (int i = 0; i < tab.length; i++) {
            int count=0;
            for (int j = 0; j < tab.length; j++) {
                if (tab[i]==tab[j])
                    count++;

            }
            if (count>temp)
            {
                temp=count;
                naj=tab[i];
            }
        }
        System.out.println("Najcześciej w tablicy pojawia się liczba: "+naj);
        System.out.println("Pojawiła się w tablicy aż: "+ temp);

//        int temp=0;
//        int najczesciej=0;
//        int[]tablica={1,2,2,1,2,6,5,2,8,1,2,7};
//        for (int i = 0; i < tablica.length; i++) {
//            int count=0;
//
//            for (int j = 0; j < tablica.length; j++) {
//                if(tablica[i]==tablica[j])
//                    count++;
//
//            }
//            if (count>temp) {
//                temp = count;
//                najczesciej=tablica[i];
//            }
//
//        }
//        System.out.println(najczesciej);
    }
}
