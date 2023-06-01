public class ExercicioOito {
    public static void main(String[] args) {
        double taxaImposto = 15.0;  // Taxa de imposto de 15%
        double custoItem = 100.0;  // Custo do item antes do imposto

        double custoTotal = somaImposto(taxaImposto, custoItem);
        System.out.println("Custo total com imposto: R$" + custoTotal);
    }

    public static double somaImposto(double taxaImposto, double custo) {
        double imposto = custo * taxaImposto / 100.0;
        double custoComImposto = custo + imposto;
        return custoComImposto;
    }
}