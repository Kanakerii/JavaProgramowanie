import java.util.*;

public class Pracownik implements Comparable <Pracownik>{
    Scanner scan = new Scanner(System.in);
    private String imie;
    private String nazwisko;
    public int wiek;
    public int wzrost;
    private String sex;
    public static int id = 0;
    public static ArrayList Lista = new ArrayList<Pracownik>();
    public static Map<Integer, Pracownik> Map = new TreeMap<Integer, Pracownik>();
    public static String temp;


    public Pracownik(String imie, String nazwisko, int wiek, int wzrost, String sex) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.wzrost = wzrost;
        this.sex = sex;
        id++;
    }

    public Pracownik() {
        id++;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public int getWzrost() {
        return wzrost;
    }

    public void setWzrost(int wzrost) {
        this.wzrost = wzrost;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                ", wzrost=" + wzrost +
                ", sex='" + sex + '\'' +
                '}'+"\n";
    }

    public static void Dodawanie() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Podaj imie");
        String imie = scan.next();
        System.out.println("Podaj nazwisko");
        String nazwisko = scan.next();
        System.out.println("Podaj wiek");
        int wiek = scan.nextInt();
        System.out.println("Podaj wzrost");
        int wzrost = scan.nextInt();
        System.out.println("Podaj płeć K/M");
        String sex = scan.next().toUpperCase().trim();
        do {
            if (!sex.matches("[K/M]")) {
                System.out.println("proszę wybrać pomiędzy k/m");
                sex = scan.next().toUpperCase().trim();
            } else
                break;
        } while (true);
        Pracownik aL = new Pracownik(imie, nazwisko, wiek, wzrost, sex);
        Lista.add(aL);
        Map.put(id, aL);
    }
    public static void SortowanieImie()
    {
        Collections.sort(Lista);
        Lista.forEach(System.out::println);
    }
    @Override
    public int compareTo(Pracownik o) {

        int tempo=0;
        if (temp.matches("1"))
            tempo=this.getWiek() - o.getWiek();
        if (temp.matches("2"))
            tempo=tempo;
        if (temp.matches("3"))
            tempo=this.getSex().compareToIgnoreCase(o.getSex());
        if (temp.matches("4"))
            tempo=this.getWzrost()-o.getWzrost();
        if (temp.matches("5"))
            tempo=this.getImie().compareToIgnoreCase(o.getImie());
        if (temp.matches("6"))
            tempo=this.getNazwisko().compareToIgnoreCase(o.getNazwisko());
        return tempo;
    }
    public static void Szukanie()
    {
        Scanner scan=new Scanner(System.in);
        String a;
//        for(Map.Entry<Integer, Pracownik> entry:Map.entrySet()){
//            int key=entry.getKey();
//            Pracownik b=entry.getValue();
             if (temp.matches("1"))
                 for(Map.Entry<Integer, Pracownik> entry:Map.entrySet()) {
                     int key = entry.getKey();
                     Pracownik b = entry.getValue();
                     {
                         int Najstarszy = 0;
                         Najstarszy = (int) Math.max(Najstarszy, b.getWiek());

                     }
                 }
             if (temp.matches("2"))
             if (temp.matches("3"))
             if (temp.matches("4")) {
                 System.out.println("Podaj wzrost");
                 int wzrost = scan.nextInt();
                 for (Map.Entry<Integer, Pracownik> entry : Map.entrySet()) {
                     int key = entry.getKey();
                     Pracownik b = entry.getValue();
                     if (b.getWzrost() == wzrost)
                         System.out.println(b);
                 }
             }
                 if (temp.matches("5"))
                     System.out.println("Podaj wiek: ");
        int wiek = scan.nextInt();
                     for(Map.Entry<Integer, Pracownik> entry:Map.entrySet()) {
                         int key = entry.getKey();
                         Pracownik b = entry.getValue();
                         {

                             if (b.getWiek() == wiek)
                                 System.out.println(b);
                         }
                     }
                     if (temp.matches("6")) {
                         System.out.println("Podaj płeć K/M");
                         a = scan.next().toUpperCase().trim();
                         if (!a.matches("[K/M]")) {
                             System.out.println("Proszę wybrać pomiędzy M/M");
                             a = scan.next().toUpperCase().trim();
                         }
                         for (Map.Entry<Integer, Pracownik> entry : Map.entrySet()) {
                             int key = entry.getKey();
                             Pracownik b = entry.getValue();
                             if (b.getSex().equals(a))
                                 System.out.println(b);
                         }
                     }
                         if (temp.matches("7"));
        {
            System.out.println("Podaj Imie: ");
            a = scan.next();
            for (Map.Entry<Integer, Pracownik> entry : Map.entrySet()) {
                int key = entry.getKey();
                Pracownik b = entry.getValue();

                if (b.getImie().equals(a))
                    System.out.println(b);
            }
        }


    }
}

