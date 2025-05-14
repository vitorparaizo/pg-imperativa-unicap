import java.util.Scanner;
public class Exemplo11 {

    public static Scanner input = new Scanner(System.in);
    public static void main (String[] args) {
        Pessoa p1 = new Pessoa();
        System.out.println("Digite o nome ");
        p1.nome = input.nextLine();
        System.out.println("digite a idade");
        p1.idade = input.nextInt();
        System.out.println("digite o peso");
        p1.peso = input.nextDouble();
        System.out.println("digite altura");
        p1.altura = input.nextDouble(); 

        System.out.println("-------impressão-------");
        System.out.println("Nome: " + p1.nome);
        System.out.println("Idade: " + p1.idade);
        System.out.println("Peso: " + p1.peso);
        System.out.println("Altura: " + p1.altura);
    System.out.println("(" + p1.nome));

    }
}