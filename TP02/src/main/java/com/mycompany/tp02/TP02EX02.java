/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp02;
import java.util.Scanner;
/**
 *
 * @author Gabriel Ribeiro - CB3021726
 * Entrar via teclado com dez valores positivos. Consistir a digitação e enviar mensagem de
erro, se necessário. Após a digitação, exibir:
a. O maior valor;
b. A soma dos valores;
c. A média aritmética dos valores.
 */
public class TP02EX02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] valores = new int[10];
        int contador = 0;

        while (contador < 10) {
            System.out.print("Digite o " + (contador + 1) + "° valor: \n" );
            int valor = scanner.nextInt();

            if (valor >= 0) {
                valores[contador] = valor;
                contador++;
            } else {
                System.out.println("Erro: O valor deve ser positivo. Tente novamente.\n");
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

        double media = soma / 10.0;

        System.out.println("\nMaior valor digitado: " + maior + "\n");
        System.out.println("Soma dos valores: " + soma + "\n");
        System.out.println("Média aritmética: " + media + "\n");

        scanner.close();
    }
}
