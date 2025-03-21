package exercicios;
import java.util.Scanner;
public class ExercicioCalculadora {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("valor da conta: ");
        double valorConta = scanner.nextDouble();

        System.out.print("percentual da multa: ");
        double percentualMulta = scanner.nextDouble();

        System.out.print("percentual de juros mensal: ");
        double jurosMensal = scanner.nextDouble();

        System.out.print("quantidade de dias em atraso: ");
        int diasAtraso = scanner.nextInt();

        
        if (diasAtraso < 45) {
            double multa = valorConta * (percentualMulta / 100);
            double jurosDiario = (jurosMensal / 30) * diasAtraso;
            double juros = valorConta * (jurosDiario / 100);
            double valorTotal = valorConta + multa + juros;

            System.out.println("\nVvalor total a pagar: R$ " + valorTotal);
        } else {
            System.out.println("\na conta está muito atrasada e não pode ser calculada.");
        }

        scanner.close();
    }
}
    

