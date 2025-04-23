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
 * Entrar com uma matriz de ordem MxN, onde a ordem também será escolhida pelo usuário,
sendo que no máximo 10x10. A matriz não precisa ser quadrática. Após a digitação dos
elementos, calcular e exibir a matriz transposta.
 */
public class TP02EX09 {
    

//public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        int m, n;
        do {
            System.out.println("Digite M (1 a 10): ");
            m = scanner.nextInt();        
            System.out.println("Digite N (1 a 10): ");
            n = scanner.nextInt();
            if ((m <= 0 || m > 10 || n <= 0 || n > 10)){
                System.out.println("Digite valores entre 1 e 10 para M e N!");
            }
        } while (m <= 0 || m > 10 || n <= 0 || n > 10);
        int[][] matriz = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Valor para posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        int[][] matrizT = new int[n][m];

   
        for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
        matrizT[j][i] = matriz[i][j]; // Inverte  posicao
            }
        }
        System.out.println("\nMatriz original:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        
        System.out.println("\nMatriz Transposta:");
        for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
        System.out.print(matrizT[i][j] + "\t");
        }
        System.out.println();

        scanner.close();
    }
}}

