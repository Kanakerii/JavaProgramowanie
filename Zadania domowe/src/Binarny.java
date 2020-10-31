import java.util.Scanner;
import java.util.Stack;

public class Binarny {
    public static void zamiana(int a)
    {
        Stack wynik=new Stack();
        int flaga=0;
        int x=0;
        String dodac="1";
        String zero="0";
        do {
            int bin=(int)Math.pow(2,x);
            if (bin < a)
                x++;
            else
            {
                for (int i = 0; i <=x ; x--) {
                    bin=(int)Math.pow(2,x);
                    if (a-bin>=0) {
                        a -= bin;
                        wynik.push(zero);
                        flaga++;
                    }
                    else {
                        wynik.push(dodac);
                        flaga++;
                    }
                }
                break;
            }
        }while(true);
        for (int i = 0; i < flaga; flaga--) {

            System.out.print(wynik.pop());
        }

    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Podaj liczbę którą chcesz zamienić na system binarny");
        int a= scan.nextInt();
        zamiana(a);

    }
}
