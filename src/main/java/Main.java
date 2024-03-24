import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numerosDigitados = 0;
        int numerosPares = 0;
        int numerosImpares = 0;

        while (numerosDigitados < 10) {
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();
            numerosDigitados++;

            if (numero % 2 == 0) {
                numerosPares++;
            } else {
                numerosImpares++;
            }
        }

        System.out.println("Quantidade de números pares: " + numerosPares);
        System.out.println("Quantidade de números ímpares: " + numerosImpares);

        scanner.close();
    }
}
