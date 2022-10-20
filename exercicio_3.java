/*
 * Lista de exercício Java - Programa Start by Capgemini
 * @author Jean Carlo Scheibe
 * 
 * Exercício 3
 * Escreva um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância
 * total percorrida pelo automóvel e o total de combustível gasto
 */

 //Importação do Scanner
import java.util.Scanner;

public class exercicio_3 {
    
    public static void main(String[] args){

        //Inicialização do Scanner
        Scanner leitor = new Scanner(System.in);

        //Inicialização das variáveis
        float consumoMedio = 0;
        float distancia = 0;
        float combustivelConsumido = 0;

        //Entrada da distância
        System.out.print("Informe a distância percorrida: ");
        distancia = leitor.nextInt();

        //Entrada do gasto
        System.out.print("Informe a quantidade de combustível gasto: ");
        combustivelConsumido = leitor.nextInt();

        //Realização e impressão da média
        consumoMedio = (distancia / combustivelConsumido);
        System.out.print("A média de gasto da viagem foi " + consumoMedio +" litros por quilometro.");

    }

}
