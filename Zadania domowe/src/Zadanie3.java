import java.util.Arrays;
import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Podaj jakiś wyraz");
        String a=scan.next();
        char[] b=a.toCharArray();
        int h=a.length();
        for (int i = 0; i <=h; i++) {
            if(i%2!=0)
            System.out.print(b[i]+ " ");

        }



    }
}
