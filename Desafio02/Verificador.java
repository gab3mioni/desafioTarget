
import java.util.Scanner;

public class Verificador {

    public static int verificarLetraA(String frase) {
        int contador = 0;

        for ( int i = 0 ; i < frase.length(); i++ ) {
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'A') {
                contador++;
            }
        }

        return contador;
    }

    public static String leia() {
        Scanner leia = new Scanner(System.in);

        System.out.print("Entre com uma frase: ");
        String frase = leia.nextLine();
        leia.close();

        return frase;
    }
}