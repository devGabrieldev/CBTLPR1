/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp02;
import java.util.Scanner;
/**
 *
 * @author Gabriel Ribeiro - CB3021726
 * 
 * Entrar via teclado com “N” valores quaisquer. O valor “N” (que representa a quantidade de
números) será digitado, deverá ser positivo, porém menor que vinte. Caso a quantidade não
satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente. Após a
digitação dos “N” valores, exibir:
a. O maior valor;
b. O menor valor;
c. A soma dos valores;
d. A média aritmética dos valores;
e. A porcentagem de valores que são positivos;
f. A porcentagem de valores negativos;
* Após exibir os dados, perguntar ao usuário de deseja ou não uma nova execução do
programa. Consistir a resposta no sentido de aceitar somente “S” ou “N” e encerrar o
programa em função dessa resposta.
 */
public class TP02EX03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resposta;

        do {
            int[] valores = new int[10]; 
            int total = 0;
            int negativos = 0;
            int contador = 0;

            System.out.println("Digite uma sequência de dez valores positivos: \n");

            while (contador < 10) {
                System.out.print("Digite o " + (contador + 1) + "° valor: ");
                int valor = scanner.nextInt();
                total++;

                if (valor >= 0) {
                    valores[contador] = valor;
                    contador++;
                } else {
                    negativos++;
                    System.out.println("Erro: Valor negativo não é aceito. Tente novamente.\n");
                }
            }

            int soma = 0;
            int maior = valores[0];

            for (int valor : valores) {
                soma += valor;
                if (valor > maior) {
                    maior = valor;
                }
            }

            double media = soma / (double) valores.length;
            double percPositivos = (valores.length / (double) total) * 100;
            double percNegativos = (negativos / (double) total) * 100;
         
            System.out.println("Maior valor digitado: " + maior);
            System.out.println("Soma dos valores: " + soma);
            System.out.printf("Média aritmética: %.2f\n", media);
            System.out.printf("Porcentagem de valores positivos aceitos: %.2f%%\n", percPositivos);
            System.out.printf("Porcentagem de valores negativos digitados (não aceitos): %.2f%%\n", percNegativos);

            do {
                System.out.print("\nDeseja executar novamente? (S/N): \n");
                resposta = scanner.next().trim().toUpperCase();

                if (!resposta.equals("S") && !resposta.equals("N")) {
                    System.out.println("Resposta inválida. Digite apenas 'S' ou 'N'.");
                }
            } while (!resposta.equals("S") && !resposta.equals("N"));

        } while (resposta.equals("S"));

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}
