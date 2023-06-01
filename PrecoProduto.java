import java.util.Scanner;

public class PrecoProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor do produto: ");
        double valorProduto = scanner.nextDouble();

        double novoValor = calcularPorcentagemAcrescida(valorProduto, 10);
        System.out.println("Novo valor do produto: " + novoValor);

        scanner.close();
    }

    public static double calcularPorcentagemAcrescida(double valor, double porcentagem) {
        double acrescimo = valor * (porcentagem / 100);
        double novoValor = valor + acrescimo;
        return novoValor;
    }
}