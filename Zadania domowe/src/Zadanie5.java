import java.util.Scanner;

public class Zadanie5 {
    public static String trojkat(double a, double b, double c)
    {
        if (a+b>c&&b+c>a&&c+a>b)
        return "Jest prostokątny";
        return "Nie jest prostokątny";
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Podaj pierwszy bok trójąta: ");
        double a=scan.nextDouble();
        System.out.println("Podaj drugi bok trójąta: ");
        double b=scan.nextDouble();
        System.out.println("Podaj trzeci bok trójąta: ");
        double c=scan.nextDouble();
        System.out.println(trojkat(a,b,c));

    }
}
