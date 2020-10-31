import java.util.Scanner;
import java.util.Stack;

public class Binarny2 {
    public static void Zamiana(int a)
    {
        StringBuilder sB=new StringBuilder();
        Stack stos=new Stack();
        int flaga=0;
        do {
            if(a%2==0)
            {
                a/=2;
                flaga++;
                stos.push(0);
            }
            else
            {
                a = a / 2;
                flaga++;
                stos.push(1);
            }
        }while(a>0);
        for (int i = 0; i < flaga; i++) {
            sB.append(stos.pop());
        }
        System.out.println(sB);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę którą chcesz zamienić na system binarny");
        int a = scan.nextInt();
        Zamiana(a);

    }
}