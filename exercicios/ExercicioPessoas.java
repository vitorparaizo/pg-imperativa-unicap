package exercicios;
import java.util.Scanner;

public class ExercicioPessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idadeMaisPesada = 0;
        double pesoMaisPesado = 0;
        int totalHomens = 0, totalMulheres = 0, mulheresMenos50kg = 0;
        double somaPesoHomensMenos30 = 0;
        
        while (true) {
            System.out.print("sexo (M/F): ");
            char sexo = scanner.next().toUpperCase().charAt(0);
            
            System.out.print(" digite a idade: ");
            int idade = scanner.nextInt();
            
            System.out.print("digite o peso (kg): ");
            double peso = scanner.nextDouble();

            if (peso >= pesoMaisPesado) {
                pesoMaisPesado = peso;
                idadeMaisPesada = idade;
            }

            if (sexo == 'M' && idade < 30) {
                totalHomens++;
                somaPesoHomensMenos30 += peso;
            }

            if (sexo == 'F') {
                totalMulheres++;
                if (peso < 50) {
                    mulheresMenos50kg++;
                }
            }

            System.out.print("deseja continuar? (S/N): ");
            char continuar = scanner.next().toUpperCase().charAt(0);
            if (continuar == 'N') break;
        }

        System.out.println("\nidade da pessoa mais pesada: " + idadeMaisPesada);
        System.out.println("média de peso dos homens com menos de 30 anos: " +
                (totalHomens > 0 ? somaPesoHomensMenos30 / totalHomens : 0) + " kg");
        System.out.println("percentual de mulheres com menos de 50 kg: " +
                (totalMulheres > 0 ? (mulheresMenos50kg * 100.0 / totalMulheres) : 0) + "%");

        scanner.close();
    }
}
