import java.util.Scanner;

public class Zadanie2 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Podaj kod pocztowy");
        String a= scan.next();
        if (a.matches("[1-9][1-9]-[0-9][0-9][0-9]"))
            System.out.println(a+" Poprawny kod pocztowy");
        else
            System.out.println("Niepoprawny kod pocztowy");


    }
}
