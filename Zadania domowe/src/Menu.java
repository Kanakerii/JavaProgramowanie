public class Menu {
    public static void Menu() {
        System.out.println("1. Dodawanie pracowników");
        System.out.println("2. Wyszukiwanie");
        System.out.println("3. Sortowanie");
        System.out.println("4. Wyświet liste pracowników");

    }

    public static void Sortowanie()
    {
        System.out.println("1. Względem wieku");
        System.out.println("2. Względem stażu pracy");
        System.out.println("3. Względem płci");
        System.out.println("4. Względem wzrostu");
        System.out.println("5. Alfabetycznie Imie ");
        System.out.println("6. Alfabetycznie Nazwisko");

    }
    public static void Wyszukiwanie() {
        System.out.println("1. Wyszukaj najstarszego pracownika");
        System.out.println("2. Wyszukaj najmłodszego pracownika");
        System.out.println("3. Wyszukaj pracownika z największym stażem względem aktualnej daty");
        System.out.println("4. Inne");
    }

    public static void Inne() {
        System.out.println("1. Wyszukiwanie po wzroście");
        System.out.println("2. Wyszukiwanie po wieku");
        System.out.println("3. Wyszukiwanie po płci");
        System.out.println("4. Wyszukiwanie po imieniu");
    }
}
