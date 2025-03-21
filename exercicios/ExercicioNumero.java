package exercicios;
import java.util.Scanner;

public class ExercicioNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("valor inicial da PA: ");
        int inicio = scanner.nextInt();

        System.out.print("fator de incremento: ");
        int incremento = scanner.nextInt();

        System.out.print("quantidade de termos: ");
        int quantidade = scanner.nextInt();

        // Impressão da série
        System.out.print("série: ");
        for (int i = 0; i < quantidade; i++) {
            System.out.print(inicio + (incremento * i) + " ");
        }

        scanner.close();
}
}