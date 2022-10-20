/*
 * Lista de exercício Java - Programa Start by Capgemini
 * @author Jean Carlo Scheibe
 * 
 * Exercício 2
 * Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão
 * dos dois números lidos
 */

import java.util.Scanner;

public class exercicio_2 {
    
    public static void main(String[] args){

        //Criação de um leitor para receber as informações do usuário
        Scanner leitor = new Scanner(System.in);
        
        //Entrada do primeiro número
        System.out.println("Digite um número: ");
        int n1 = leitor.nextInt();

        //Entrada do segundo número
        System.out.println("Digite outro número: ");
        int n2 = leitor.nextInt();

        //Código para realização e impressão da soma
        int soma = (n1 + n2);
        System.out.println("O resultado da soma de " + n1 + " e " + n2 + " é: " + soma);

        //Código para realização e impressão da subtração
        int subtracao = (n1 - n2);
        System.out.println("O resultado da subtração de " + n1 + " e " + n2 + " é: " + subtracao);

        //Código para realização e impressão da multiplicação
        int multiplicacao = (n1 * n2);
        System.out.println("O resultado da multiplicação de " + n1 + " e " + n2 + " é: " + multiplicacao);

        //Código para realização e impressão da divisão
        int divisao = (n1 / n2);
        System.out.println("O resultado da divisão de " + n1 + " e " + n2 + " é: " + divisao);


        //Novamente, optei por não iniciar as variáveis no começo do código

    }
    
}
