package exercicios;
import java.util.Random;
public class Exercicio1 {

    public static void main(String[] args) {
        Random random = new Random();

        // Contadores de vitórias para cada jogador
        int vitoriasJogador1 = 0;
        int vitoriasJogador2 = 0;

        // Realiza 10 rodadas
        for (int i = 1; i <= 10; i++) {
            System.out.println("Rodada " + i + ":");
            // Jogada do jogador 1
            int jogadaJogador1 = random.nextInt(6) + 1; // Número aleatório entre 1 e 6
            // Jogada do jogador 2
            int jogadaJogador2 = random.nextInt(6) + 1; // Número aleatório entre 1 e 6

            System.out.println("Jogador 1 tirou: " + jogadaJogador1);
            System.out.println("Jogador 2 tirou: " + jogadaJogador2);

            // Determina o vencedor da rodada
            if (jogadaJogador1 > jogadaJogador2) {
                System.out.println("Jogador 1 venceu esta rodada!");
                vitoriasJogador1++;
            } else if (jogadaJogador2 > jogadaJogador1) {
                System.out.println("Jogador 2 venceu esta rodada!");
                vitoriasJogador2++;
            } else {
                System.out.println("Empate nesta rodada!");
            }

            System.out.println();
        }

        // Verifica quem é o vencedor geral
        System.out.println("Resultado final após 10 rodadas:");
        System.out.println("Vitórias Jogador 1: " + vitoriasJogador1);
        System.out.println("Vitórias Jogador 2: " + vitoriasJogador2);

        if (vitoriasJogador1 > vitoriasJogador2) {
            System.out.println("Jogador 1 é o vencedor do jogo!");
        } else if (vitoriasJogador2 > vitoriasJogador1) {
            System.out.println("Jogador 2 é o vencedor do jogo!");
        } else {
            System.out.println("O jogo terminou em empate!");
        }
    }
}
