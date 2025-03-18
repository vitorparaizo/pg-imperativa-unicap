import java.util.Scanner;
public class ExercicioLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("digite o valor da conta:");
        double valorConta = scanner.nextDouble();
        
        System.out.println("digite o percentual da multa:");
        double percentualMulta = scanner.nextDouble();
        
        System.out.println("digite o percentual de juros mensal:");
        double jurosMensal = scanner.nextDouble();
        
        System.out.println("digite a quantidade de dias em atraso:");
        int diasAtraso = scanner.nextInt();
        
        if (diasAtraso < 45) {
            double multa = valorConta * (percentualMulta / 100);
            double jurosDiario = (jurosMensal / 30) * diasAtraso;
            double juros = valorConta * (jurosDiario / 100);
            double valorTotal = valorConta + multa + juros;
            System.out.println("valor total a pagar: R$" + valorTotal);
        } else {
            System.out.println("a conta está muito atrasada e não pode ser calculada.");
        }
        
        System.out.println("digite a categoria do produto (1, 2 ou 3):");
        int categoria = scanner.nextInt();
        
        System.out.println("digite o preço do produto:");
        double precoProduto = scanner.nextDouble();
        
        System.out.println("digite a quantidade comprada:");
        int quantidade = scanner.nextInt();
        
        double descontoCategoria = switch (categoria) {
            case 1 -> 0.10;
            case 2 -> 0.15;
            case 3 -> 0.08;
            default -> {
                System.out.println("categoria inválida!");
                yield 0.0;
            }
        };
        
        double descontoQuantidade = quantidade <= 2 ? 0.02 : (quantidade <= 10 ? 0.05 : 0.10);
        
        double descontoTotal = descontoCategoria + descontoQuantidade;
        double precoComDesconto = precoProduto * (1 - descontoTotal);
        double totalCompra = precoComDesconto * quantidade;
        double economia = (precoProduto * quantidade) - totalCompra;
        
        System.out.println("novo preço por produto: R$" + precoComDesconto);
        System.out.println("total da compra: R$" + totalCompra);
        System.out.println("economia: R$" + economia);
        
        int idadeMaisPesado = 0;
        double somaPesoHomens = 0;
        int contadorHomens = 0;
        int mulheresMenos50Kg = 0;
        int totalMulheres = 0;
        
        System.out.println("digite o número de pessoas a serem cadastradas:");
        int numPessoas = scanner.nextInt();
        
        for (int i = 0; i < numPessoas; i++) {
            System.out.println("digite o sexo (M/F):");
            char sexo = scanner.next().toUpperCase().charAt(0);
            
            System.out.println("digite a idade:");
            int idade = scanner.nextInt();
            
            System.out.println("digite o peso:");
            double peso = scanner.nextDouble();
            
            if (peso > idadeMaisPesado) {
                idadeMaisPesado = idade;
            }
            
            if (sexo == 'M' && idade < 30) {
                somaPesoHomens += peso;
                contadorHomens++;
            }
            
            if (sexo == 'F') {
                totalMulheres++;
                if (peso < 50) {
                    mulheresMenos50Kg++;
                }
            }
        }
        
        double mediaPesoHomens = (contadorHomens > 0) ? (somaPesoHomens / contadorHomens) : 0;
        double percentualMulheresLeves = (totalMulheres > 0) ? ((double) mulheresMenos50Kg / totalMulheres) * 100 : 0;
        
        System.out.println("idade da pessoa mais pesada: " + idadeMaisPesado);
        System.out.println("média de peso dos homens com menos de 30 anos: " + mediaPesoHomens);
        System.out.println("poercentual de mulheres com menos de 50kg: " + percentualMulheresLeves + "%");
        
        System.out.println("digite o valor inicial da progressão aritmética:");
        int valorInicial = scanner.nextInt();
        
        System.out.println("digite o fator de incremento:");
        int incremento = scanner.nextInt();
        
        System.out.println("digite a quantidade de termos:");
        int termos = scanner.nextInt();
        
        for (int i = 0; i < termos; i++) {
            System.out.print(valorInicial + " ");
            valorInicial += incremento;
        }
        
        scanner.close();
    }
}


    

