/*
 * Lista de exercício Java - Programa Start by Capgemini
 * @author Jean Carlo Scheibe
 * 
 * Exercício 4
 * Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total 
 * de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 
 * 15% de comissão sobre suas vendas efetuadas, informar o seu nome, o salário fixo 
 * e salário no final do mês;
 */

//Importação do Scanner
import java.util.Scanner;

public class exercicio_4 {

    public static void main(String[] args){

        //Inicialização do Scanner
        Scanner leitor = new Scanner(System.in);

        //Inicialização das variáveis
        String vendedor;
        float salarioFixo;
        float totalVendas;
        float salarioFinal;
        float comissao;

        //Entrada da variável vendedor
        System.out.print("Informe o nome do vendedor: ");
        vendedor = leitor.nextLine();

        //Entrada da variável salarioFixo
        System.out.print("Informe o salário: ");
        salarioFixo = leitor.nextFloat();
        
        //Entrada da variável totalVendas
        System.out.print("Informe o valor das vendas no mês: ");
        totalVendas = leitor.nextFloat();

        //Método para o cálculo da variável salário final
        //Esse método faz o cálculo do salário fixo + 15% do total de vendas, o valor de sua comissão
        //Impressão do nome do vendedor, salário fixo e valor final
        comissao = (totalVendas * 15 / 100);
        salarioFinal = (salarioFixo + comissao);
        
        System.out.println("O vendedor " + vendedor + ", tem salário fixo de R$" + salarioFixo);
        System.out.println("Seu total de vendas foi de R$ " + totalVendas);
        System.out.println("Sua comissao de 15% sobre as vendas somou R$" + comissao);
        System.out.println("O valor final que " + vendedor + " deve receber é R$ " + salarioFinal);

        /* Optei por usar System.out.print nas entradas de dados, considero que fica visualmente mais interessante
         * Também optei por imprimir o valor da comissão, para que o relatório final seja mais detalhado e funcional
         */
    }
    
}
