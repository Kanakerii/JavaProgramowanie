import java.util.Scanner;

public class PracownikDemo {
    public static void Dodawanie()
    {


    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Pracownik p1=new Pracownik("Oskar","Makuch",21,193,"M");
        Pracownik p2=new Pracownik("Karolina","Dragon",20,165,"K");
        Pracownik p3=new Pracownik("Oliwia","Dragon",14,156,"K");
        Pracownik p4=new Pracownik("Kacper","Makuch",19,191,"M");
        Pracownik.Lista.add(p1);    Pracownik.Map.put(1,p1);
        Pracownik.Lista.add(p2);    Pracownik.Map.put(2,p2);
        Pracownik.Lista.add(p3);    Pracownik.Map.put(3,p3);
        Pracownik.Lista.add(p4);    Pracownik.Map.put(4,p4);
        do {
            System.out.println("Witaj w programie MyEmployee");
            System.out.println("Wybierz jedną z podanych opcji poniżej");
            Menu.Menu();
            String b;
            String a = scan.next();
            switch (a) {
                case "1":
                    Pracownik.Dodawanie();
                    break;


                case "2":
                    Menu.Wyszukiwanie();
                    b = scan.next();
                    Pracownik.temp=b;
                    if (b.equals("4"))
                    {
                        Menu.Inne();
                        b= scan.next();
                        Pracownik.temp=b+3;
                        Pracownik.Szukanie();
                    }
                    Pracownik.Szukanie();
                case "3":
                    Menu.Sortowanie();
                    b= scan.next();
                    Pracownik.temp=b;
                    Pracownik.SortowanieImie();
                    break;
                case "4":
                    System.out.println("Ilość pracowników wynosi: "+Pracownik.id);
                    System.out.println(Pracownik.Lista);
                    break;
                default:
                    System.out.println("Podana wartość jest błędna");
                    break;

            }
        }while(true);


    }
}
