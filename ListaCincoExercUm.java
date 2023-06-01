import java.util.Scanner;

public class ListaCincoExercUm {

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

double numeroUm, numeroDois;

System.out.println("Informe o primeiro número:");
numeroUm = scanner.nextDouble();

System.out.println("Informe o segundo número:");
numeroDois = scanner.nextDouble();

scanner.close();

System.out.println(" A média aritimética desses números é igual a:" + mediaAritimetica(numeroUm, numeroDois));
}

public static double mediaAritimetica (double numeroUm, double numeroDois){
    double media;
    media = (numeroUm + numeroDois)/2;
    return (media);
}


}




