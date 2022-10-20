/*
 * Lista de exercício Java - Programa Start by Capgemini
 * @author Jean Carlo Scheibe
 * Faça um algoritmo que receba dois números e exiba o resultado da sua soma 
 */

//Importando a classe Scanner
 import java.util.Scanner;

public class exercicio_1 {
    
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

        //Nesse caso, optei por não iniciar as variáveis no começo do código

    }

}
