package collection.list.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**Faça um programa que receba a temperatura média dos seis primeiros meses do ano e
 * armazena-as na lista.
 *
 */
public class Temperatura {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Double>temperaturas = new ArrayList<>();

        // adicionando as temperaturas na lista:
        int count = 0;
        while (true){
            if (count == 3)break;

            System.out.println("Digite a temperatura: ");
            double temp = leitor.nextDouble();
            temperaturas.add(temp);
            count++;
        }
        System.out.println("***********************************************");

        // exibindo todas as temperaturas:
        System.out.println("Todas as temperaturas: ");
        temperaturas.forEach(t -> System.out.print(t + " "));

        // calculando e exibindo a média das temperaturas:
        double media = temperaturas.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0d);
        System.out.printf("\n Média das temperaturas: %.1f \n" + media);

        // exibindo as temperaturas acima da média:

        System.out.println("--\t Temperaturas acima da média \t--");
        temperaturas.stream().filter(t -> t > media).forEach(t -> System.out.printf("%.1f ", t));





    }

}
