
public class Desafio01 {
    public static void main(String[] args) {

        int numero = Fibonacci.leia();

        if (Fibonacci.verificarFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }
    }
}
