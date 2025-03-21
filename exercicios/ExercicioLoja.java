package exercicios;

import java.util.Scanner;

public class ExercicioLoja {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int categoria;
        do {
            System.out.print("categoria do produto (1, 2 ou 3): ");
            categoria = scanner.nextInt();
            if (categoria < 1 || categoria > 3) {
                System.out.println("categoria inválida! Digite 1, 2 ou 3.");
            }
        } while (categoria < 1 || categoria > 3);

        double precoProduto;
        do {
            System.out.print("preço do produto: ");
            precoProduto = scanner.nextDouble();
            if (precoProduto <= 0) {
                System.out.println("o preço deve ser maior que zero.");
            }
        } while (precoProduto <= 0);

        int quantidade;
        do {
            System.out.print("quantidade comprada: ");
            quantidade = scanner.nextInt();
            if (quantidade <= 0) {
                System.out.println("a quantidade deve ser maior que zero.");
            }
        } while (quantidade <= 0);

        double descontoCategoria = 0;
        switch (categoria) {
            case 1:
                descontoCategoria = 10;
                break;
            case 2:
                descontoCategoria = 15;
                break;
            case 3:
                descontoCategoria = 8;
                break;
        }

        double descontoQuantidade = 0;
        if (quantidade <= 2) {
            descontoQuantidade = 2;
        } else if (quantidade <= 10) {
            descontoQuantidade = 5;
        } else {
            descontoQuantidade = 10;
        }

        double descontoTotal = descontoCategoria + descontoQuantidade;
        double precoComDesconto = precoProduto * (1 - descontoTotal / 100);
        double valorTotalCompra = precoComDesconto * quantidade;
        double valorOriginalCompra = precoProduto * quantidade;
        double economia = valorOriginalCompra - valorTotalCompra;

        System.out.println("\ndesconto aplicado: " + descontoTotal + "%");
        System.out.println("novo preço unitário: R$ " + precoComDesconto);
        System.out.println("valor total da compra: R$ " + valorTotalCompra);
        System.out.println("você economizou: R$ " + economia);

        scanner.close();
    }
}
    
