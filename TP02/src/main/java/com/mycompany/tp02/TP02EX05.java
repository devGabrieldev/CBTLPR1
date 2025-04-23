/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp02;
import java.util.Scanner;
/**
 *
 * @author Gabriel Ribeiro - CB3021726
 * Armazenar seis valores em uma matriz de ordem 3x2. Apresentar os valores na tela.
 */
public class TP02EX05 {

   

//public class EX05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][2];

        System.out.println("Digite 6 valores para preencher a matriz 3x2:");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Valor para posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        System.out.println("\nMatriz 2x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
