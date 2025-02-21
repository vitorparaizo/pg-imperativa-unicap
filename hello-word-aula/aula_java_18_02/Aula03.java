import java.util.Scanner;
public class Aula03 {

    public static Scanner input = new Scanner(System.in);

    public static void maiin (String[] args){
        int num;
        System.out.print("Digite um numero inteiro: ");
        num = input.nextInt();
        System.out.println("voce digitou " + num);

        if (num < 0) {
            System.out.println("o numero " + num + "negativo");
        }
        
        else {
            System.out.print("o numero " + num + "não é negativo");
        }
    }
    
}
