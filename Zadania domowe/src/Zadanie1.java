import java.util.Scanner;

public class Zadanie1 {
    public static String palindrom(String a)
    {
        int kk=0;
        int h=a.length();
        int k=h-1;
        for (int i = 0; i <h; i++) {
            if(a.charAt(i)!=a.charAt(k))
            {
                kk=1;
                return "Nie jest palindromem";
            }
            k--;
        }
        return "Jest palindromem";
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Podaj wyraz który chciałbyś sprawdzić");
        String a= scan.next().toLowerCase();
        System.out.println(palindrom(a));

    }
}
