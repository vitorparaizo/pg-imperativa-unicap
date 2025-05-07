import java.util.Scanner;
public class ReverterVetor {

    public static void preencherVetor (int[] V) {

        Scanner scanner = new scanner (System.in);

        for (int i = 0; i < V.lenght; i++) {
            System.out.println("na posição " + (i+1) " :")
            V[i] = scanner.nextInt()

        }
    }

    public static void main (String[] args) {

        int meuVetor = new int[6];

        preencherVetor(meuVetor)
    }

}