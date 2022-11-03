package collection.list.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**Faça um programa que receba a temperatura média dos três primeiros meses do ano e
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
        System.out.printf("\nMédia das temperaturas: %.1f\n ", media);

        // exibindo as temperaturas acima da média:

        System.out.println("\nTemperaturas acima da média");
        temperaturas.stream().filter(t -> t > media).forEach(t -> System.out.printf("%.1f ", t));

     // exbindo o mês das temperaturas acima da média por extenso:
        System.out.println("\nMeses das temperaturas acima da média ");
        Iterator<Double> iterator = temperaturas.iterator();
        count = 0;
        while (iterator.hasNext()){
            Double next = iterator.next();
            if (next > media){
                switch (count){
                    case(0):
                        System.out.printf("1 - Janeiro: %.1f\n ", next);
                        break;
                    case(1):
                        System.out.printf("2 - Fevereiro: %.1f\n ", next);
                        break;
                    case(2):
                        System.out.printf("3 - Março: %.1f\n ", next);
                        break;
                    default:
                        System.out.println("Não houve temperatura acima da média.");
                }
            }
            count++;
        }


    }

}
