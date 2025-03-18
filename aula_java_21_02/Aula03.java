package aula_java_21_02;
import java.util.Scanner;
public class Aula03 {

    public static Scanner input = new Scanner(System.in);

    public static void main (String[] args){
        int num;
        System.out.print("Digite um numero inteiro: ");
        num = input.nextInt();
        System.out.println("voce digitou " + num);

        if (num < 0) {
            System.out.println("o numero " + num + "negativo");
        }
        else {
            if (num == 0) {
                System.out.println("o numero " + num + " neutro");
            } else{
                System.out.print("o numero " + num + "não é negativo");
            }
        
            double altura;
            double peso; 

            System.out.print("Sua altura: ");
            altura = input.nextDouble();

            System.out.print("seu peso");
            peso = input.nextDouble();

            if (peso / (altura * altura) >= 40.0) {
                System.out.print("you're fat! ");
            } else {
                System.out.print("you the next best americans next top model");
            }

        }
    }
}
