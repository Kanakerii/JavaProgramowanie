import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Podaj jakieś zdanie bądź wyraz");
        String a=scan.nextLine().toLowerCase();
        char[] b=a.toCharArray();
        int h=a.length();
        int samogloski=0;
        for (int i = 0; i <h; i++) {
            switch (b[i])
            {
                case 'a':
                    samogloski++;
                    break;
                case 'ą':
                    samogloski++;
                    break;
                case 'e':
                    samogloski++;
                    break;
                case 'ę':
                    samogloski++;
                    break;
                case 'i':
                    samogloski++;
                    break;
                case 'y':
                    samogloski++;
                    break;
                case 'o':
                    samogloski++;
                    break;
                case 'ó':
                    samogloski++;
                    break;
                case 'u':
                    samogloski++;
                    break;
                default:
                    break;

            }
        }
        System.out.println("Ilość samogłosek wynosi: "+samogloski);

    }
}
