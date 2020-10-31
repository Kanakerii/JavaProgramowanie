import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Wypisz ciąg liczb do zsumowania");
        System.out.println("Wpisanie liczby 0 poskutkuje zakonczenie sumowania i wyswietleniem wyniku");
        int suma=0;
        int i=0;
        do {
           int a= scan.nextInt();
           if (a<10&& a!=0)
           suma+=a;
           else if(a==0)
               break;
           else
               System.out.println("Błędna wartość");

        }while(true);
        System.out.println(suma);

    }
}
