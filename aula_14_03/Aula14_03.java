import java.util.Scanner;

public class Aula14_03 {

    public static void main(String[] args) {
        double[] notas = new double[5];
        Scanner input = new Scanner(System.in);
        double soma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a " + (i + 1) + "ª nota: ");
            notas[i] = input.nextDouble();
            soma += notas[i];  
        }

        double media = soma / 5;

        System.out.println("a primeira nota é: " + notas [0]);
        System.out.println("a primeira nota é: " + notas [1]);
        System.out.println("a primeira nota é: " + notas [2]);
        System.out.println("a primeira nota é: " + notas [3]);
        System.out.println("a primeira nota é: " + notas [4]);

        System.out.println("a média das somas é: " + media);

    System.out.println("notas acima da media");
    for (int i = 0; i < 5; i++) {
        if (notas[i] > media) {
            System.out.println(notas[i]);
        }
    }
}
}

 