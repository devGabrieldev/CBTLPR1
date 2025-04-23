/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp02;
import java.util.Scanner;
/**
 *
 * @author Gabriel Ribeiro - CB3021726
 * Armazenar seis nomes em uma matriz de ordem 2x3. Apresentar os nomes na tela.
 */
public class TP02EX06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] matriz = new String[2][3];
        System.out.println("Digite 6 nomes para preencher a matriz 2x3:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Nome para posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextLine(); 
            }
        }

        System.out.println("\nMatriz resultante:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}


