
import java.util.Scanner;

public class Fibonacci {

    public static int leia() {
        Scanner leia = new Scanner(System.in);

        System.out.print("Entre com um número: ");
        int numero = leia.nextInt();
        leia.close();
        return numero;
    }

    public static boolean verificarFibonacci(int numero) {
        int a = 0, b = 1, c = 1;

        if ( numero == a || numero == b ) {
            return true;
        }

        while ( c < numero ) {
            c = a +b;
            a = b;
            b = c;
        }

        return c == numero;
    }
}
