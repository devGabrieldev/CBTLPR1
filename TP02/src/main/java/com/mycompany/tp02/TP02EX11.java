/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp02;
import org.apache.commons.math3.linear.*;
import java.util.Scanner;
/**
 *
 * @author Gabriel Ribeiro - CB3021726
 * Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário,
sendo que no máximo será de ordem 10 e quadrática. Após a digitação dos elementos,
calcular e exibir determinante da matriz.
 */
public class TP02EX11 {    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ordem;    
        do {
            System.out.print("Digite a ordem da matriz quadrada (até 10): ");
            ordem = scanner.nextInt();
            if (ordem <= 0 || ordem > 10) {
                System.out.println("A ordem deve estar entre 1 e 10.\n");
            }
        } while (ordem <= 0 || ordem > 10);
        double[][] matriz = new double[ordem][ordem];
        System.out.println("\nDigite os elementos da matriz " + ordem + "x" + ordem + ":");
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextDouble();
            }
        }

        // Calcula determinante com Apache Commons Math
        RealMatrix realMatrix = MatrixUtils.createRealMatrix(matriz);
        double determinante = new LUDecomposition(realMatrix).getDeterminant();
        System.out.printf("\nDeterminante da matriz: %.2f\n", determinante);

        scanner.close();
    }
}


