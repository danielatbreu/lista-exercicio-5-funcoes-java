import java.util.Scanner;

public class ListaCincoExercQuatro {

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

double numeroUm, numeroDois, numeroTres;


System.out.println("Informe o primeiro número:");
numeroUm = scanner.nextDouble();

System.out.println("Informe o segundo número:");
numeroDois = scanner.nextDouble();

System.out.println("Informe o terceiro número:");
numeroTres = scanner.nextDouble();

scanner.close();

System.out.println(" A média aritimética desses números é igual a:" + mediaAritimetica(numeroUm, numeroDois, numeroTres));
System.out.println(" A média harmônica desses números é igual a:" + mediaHarmonica(numeroUm, numeroDois, numeroTres));
System.out.println(" A média geométrica desses números é igual a:" + mediaGeometrica(numeroUm, numeroDois, numeroTres)); }


public static double mediaAritimetica (double numeroUm, double numeroDois, double numeroTres){
    double mediaAritimetica;
    mediaAritimetica = (numeroUm + numeroDois + numeroTres)/3;
    return (mediaAritimetica);
}

public static double mediaHarmonica (double numeroUm, double numeroDois, double numeroTres){
    double mediaHarmonica;
    mediaHarmonica = (3/ ((1/numeroUm) + (1/numeroDois) + (1/numeroTres)));
    return (mediaHarmonica);


}
public static double mediaGeometrica (double numeroUm, double numeroDois, double numeroTres){
    double mediaGeometrica;
    mediaGeometrica = Math.cbrt(numeroUm * numeroDois * numeroTres);
    return (mediaGeometrica);

}


}